package cn.abble.jhtml.tags;

import javax.annotation.Nullable;
import java.util.List;

/**
 * 所有的标签都实现了这个接口
 * @author 张郡峰
 * @version Version 1.0
 * @since 1.0
 */
public interface Tag {
    /**
     * 获取标签的名称，如html,body,h1,h2
     * @return 返回标签名称
     */
    String getTagName();

    /**
     * 获取该标签的HTML文本，如<input id="username" name="username" type="text"/>
     * @return 该标签的HTML文本
     */
    String getText();

    /**
     * 获取所有的子标签
     * @return 返回所有的子标签
     */
    List<Tag> getChildrenTags();

    /**
     * 获取父标签
     * @return 返回父标签
     */
    Tag getParent();

    /**
     * 向该标签添加属性
     * @param name 属性名
     * @param value 属性值 可以为空
     */
    void addAttribute(String name,@Nullable String value);

    /**
     * 向该标签添加多个属性。
     * 属性名称和属性值使用等号分割,不需要属性值的就直接输入属性名就可以如:
     * input.addAttribute("id=1","class='username'","readonly");
     * @param nameAndValue 属性名与属性值，可以使用等号分割,如input.addAttribute("id=1","class='username'","readonly");
     */
    void addAttribute(String... nameAndValue);

    /**
     * 清空该标签的所有属性。
     */
    void clearAttributes();

    /**
     * 根据属性名删除属性
     * @param name 属性名
     * @return 是否删除成功 true是成功，false是不成功
     */
    boolean delAttribute(String name);


}
