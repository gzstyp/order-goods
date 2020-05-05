package com.fwtai.pojo;

/**
 * 商品
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-05 14:11
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
public final class Item{

    private Long id;

    private String title;

    private String pic;

    private String desc;

    private Long price;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPic(){
        return pic;
    }

    public void setPic(String pic){
        this.pic = pic;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public Long getPrice(){
        return price;
    }

    public void setPrice(Long price){
        this.price = price;
    }

    public Item(){}

    public Item(Long id,String title,String pic,String desc,Long price){
        this.id = id;
        this.title = title;
        this.pic = pic;
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Item{" + "id=" + id + ", title='" + title + '\'' + ", pic='" + pic + '\'' + ", desc='" + desc + '\'' + ", price=" + price + '}';
    }
}