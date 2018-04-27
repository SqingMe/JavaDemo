package com.corc;

/**
 * 矩形类
 *
 */
public class Rectangular {
	
       private Integer width;
       private Integer height;
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Rectangular() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 描述: 获取矩形面积
	 * @return
	 * @throws Exception 
	 */
	public Integer getArea() throws Exception {
		if(this.width > 0 && this.height > 0 )
		return this.width * this.height;
		throw new Exception("矩形的长和宽必须大于0");
	}
	public Rectangular(Integer width, Integer height) {
		super();
		this.width = width;
		this.height = height;
	}
       public static void main(String[] args) throws Exception {
		Rectangular rectangular = new Rectangular(2, 3);
		Integer area = rectangular.getArea();
		System.out.println("矩形的面积是：" + area);
	}
}
