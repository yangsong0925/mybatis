# mybatis
mybatis 学习


 <!-- useGeneratedKeys="true"把新增加的主键赋值到自己定义的keyProperty（id）中 -->
useGeneratedKeys 取值范围true|false 默认值是：false。 含义：设置是否使用JDBC的getGenereatedKeys方法获取主键并赋值到keyProperty设置的领域模型属性中


注意 你可以传递一个 List 实例或者数组作为参数对象传给 MyBatis。当你这么做的时 候,MyBatis 会自动将它包装在一个 Map 中,用名称在作为键。List 实例将会以“list” 作为键,而数组实例将会以“array”作为键
参数只有一个，而且传入的是一个List集合，所以mybatis会自动封装成Map<"list",studentNameList>。在解析的时候会通过“list”作为Map的key值去寻找。但是我在xml中却声明成studentNameList了，所以自然会报错找不到。