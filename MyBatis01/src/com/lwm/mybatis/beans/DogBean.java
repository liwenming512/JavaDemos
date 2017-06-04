package com.lwm.mybatis.beans;

public class DogBean extends PetBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer bone;
	
	public DogBean(){
		super();
	}
	
	public DogBean(Integer id, String name){
		super(id, name);
	}

	public Integer getBone() {
		return bone;
	}

	public void setBone(Integer bone) {
		this.bone = bone;
	}
	
    @Override
    public String toString() {
        return "DogBean [bone=" + bone + ", toString()=" + super.toString()
                + "]";
    }

}
