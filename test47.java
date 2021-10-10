//遍历数组
 public static String toString(long[] array) {
        // 遍历
        String ans = "[";

        // 遍历 除了 最后一个元素之外的其余所有元素
        for (int i = 0; i < array.length - 1; i++) {
            long element = array[i];

            ans = ans + element + ", ";
        }

        // 把最后一个元素添加到字符串 ans 中
        // 数组中最后一个元素的下标是 array.length - 1
        // 思考 array.length 的取值范围是多少 >= 0
        if (array.length > 0) {
            long lastElement = array[array.length - 1];
            ans = ans + lastElement;
        }

        ans = ans + "]";

        return ans;
    }