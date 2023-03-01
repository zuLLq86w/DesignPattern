package 设计模式.原型模式.DeepClone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name; // 值类型

    public  DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepProtoType(){
        super();
    }

    // 深拷贝 -方式1 使用clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;

        // 这里完成对基本数据类型（属性）的克隆
        deep = super.clone();
        // 对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }

    // 深拷贝 -方式2 通过对象的序列化实现深拷贝（推荐使用）
    public Object deepClone(){
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();
            return copyObj;

        }catch (Exception e){
            System.out.println(e);
            return null;
        } finally {
            // 关闭流
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e){
                System.out.println(e);
            }
        }

    }
}
