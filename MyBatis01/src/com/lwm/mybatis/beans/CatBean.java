package com.lwm.mybatis.beans;

public class CatBean extends PetBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer fish;
	
	public CatBean(){
		super();
	}
	
	public CatBean(Integer id, String name){
		super(id, name);
	}

	public Integer getFish() {
		return fish;
	}

	public void setFish(Integer fish) {
		this.fish = fish;
	}
	
    @Override
    public String toString() {
        return "CatBean [fish=" + fish + ", toString()=" + super.toString()
                + "]";
    }
}
