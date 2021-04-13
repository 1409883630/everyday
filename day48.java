//输出倒置之后的字符串，以空格分隔
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int x=0;
        LinkedList<Character> list = new LinkedList<Character>();
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)!=' '){
                char c=s1.charAt(i);
                list.add(c);
                continue;
            }
            String str = "";
            while(list.size() > 0) {
                str += list.removeLast();
            }
            System.out.print(str+" ");
        }
        String str = "";
        while(list.size() > 0) {
            str += list.removeLast();
        }
        System.out.print(str);
    }
