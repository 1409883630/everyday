//�滻�ո�,��ʵ��һ�����������ַ��� s �е�ÿ���ո��滻��"%20"
class Solution {
    public String replaceSpace(String s) {

        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }


    }