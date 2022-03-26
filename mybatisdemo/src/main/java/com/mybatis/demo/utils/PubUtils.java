package com.mybatis.demo.utils;/**
 * Created by Administrator on 2019/11/20.
 */

import com.mybatis.demo.model.EnumVo;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author liwenming
 * @Description 工具类，静态扫描包中所有的枚举类型
 * @Date 2019/11/20 8:47
 **/
public class PubUtils {

    public final static String INTERFACE_NAME = "com.mybatis.demo.model.ValuedEnum";

    private final static Map<Integer, ArrayList<EnumVo>> EnumVoListMap = new HashMap<>();

    /**
     * 扫描制定目录下所有的.class文件，得到全路径名
     * @param basePack 为.java的路径
     * @return
     * @throws ClassNotFoundException
     */
    private static List<String> searchClass(String basePack) throws ClassNotFoundException
    {
        List<String> classPaths = new ArrayList<String>();
        // 包名转换为路径,首先得到项目的classpath
        String projectClasspath = PubUtils.class.getResource("/").getPath();
        // 包名basPach转换为路径名
        basePack = basePack.replace(".", File.separator);
        // 合并classpath和basePack
        String searchPath = projectClasspath + basePack;
        doPath(projectClasspath, new File(searchPath), classPaths);

        return classPaths;
    }

    /**
     * 该方法会得到所有的类，将类的绝对路径写入到classPaths中
     * @param file
     */
    private static void doPath(String projectClasspath, File file, List<String> classPaths)
    {
        if (file.isDirectory())
        {// 文件夹
            // 文件夹就递归
            File[] files = file.listFiles();
            for (File fileTemp : files)
            {
                doPath(projectClasspath, fileTemp, classPaths);
            }
        }
        else
        {// 标准文件
            // 标准文件判断是否是class文件
            if (file.getName().endsWith(".class"))
            {
                // 如果是class文件的绝对路径转换为全类名放入集合中。
                classPaths
                        .add(file.getPath().replace(projectClasspath.replace("/", "\\").replaceFirst("\\\\", ""), "").replace("\\", ".").replace(".class", ""));
            }
        }
    }

    public static Map<Integer, ArrayList<EnumVo>> getAllEnumVoList(){
        if (EnumVoListMap == null || EnumVoListMap.size() == 0){
            List<String> classPaths = new ArrayList<>();
            try {
                classPaths = PubUtils.searchClass("com.mybatis.demo.model");
                for(String classPath:classPaths){
                    Class<?> cls = null;
                    cls = Class.forName(classPath);
                    Class <?>[]iter=cls.getInterfaces();
                    for(Class cz:iter){
                        if (cz.getName().equals(INTERFACE_NAME)){
                            //反射获取枚举类
                            Class<Enum> clazz = (Class<Enum>) Class.forName(classPath);
                            //获取所有枚举实例
                            Enum[] enumConstants = clazz.getEnumConstants();
                            //根据方法名获取方法
                            try {
                                Method val = clazz.getMethod("getKey");
                                Method desc = clazz.getMethod("getValue");
                                ArrayList<EnumVo> enumVoList = new ArrayList<EnumVo>();
                                Enum enum0 = enumConstants[0];
                                Object obj0 = val.invoke(enum0);
                                Integer key = Integer.valueOf(obj0.toString()) / 100 * 100;
                                for (Enum enum1 : enumConstants) {
                                    //执行枚举方法获得枚举实例对应的值
                                    Object invoke1 = val.invoke(enum1);
                                    Object invoke2 = desc.invoke(enum1);
//                                    System.out.println(invoke1.toString()+":"+invoke2.toString()+":" +enum1.name());
                                    EnumVo enumVo = new EnumVo();
                                    enumVo.setKey(Integer.valueOf(invoke1.toString()));
                                    enumVo.setValue(invoke2.toString());
                                    enumVo.setName(enum1.name());
                                    enumVoList.add(enumVo);
                                }
                                EnumVoListMap.put(key, enumVoList);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return EnumVoListMap;
    }

    public static List<EnumVo> getEnumVoListByCode(Integer code){
        return PubUtils.getAllEnumVoList().get(code);
    }

    public static void main(String[] args) {
        List<EnumVo> enumVoList = PubUtils.getEnumVoListByCode(11600);
        for(EnumVo enumVo: enumVoList){
            System.out.println(enumVo.toString());
        }
    }
}
