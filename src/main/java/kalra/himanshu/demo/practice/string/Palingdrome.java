package kalra.himanshu.demo.practice.string;

public class Palingdrome {

    public static void main(String[] args) {
        Palingdrome p = new Palingdrome();
        System.out.println("Result:" +p.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {


        int start = 0, end = s.length()-1;

        while(start<end) {
            Character sc = getValid(s.charAt(start));
            if(sc==null) {
                ++ start;
                continue;
            }
            Character ec = getValid(s.charAt(end));
            if(ec==null) {
                --end;
                continue;
            }
            if(sc!=ec) return false;
            ++start;
            --end;
        }
        return true;
    }

    private Character getValid(char c) {
        if(c>='a' && c<='z') return c;
        if(c>='A' && c<='Z') return (char) (c + ('a'- 'A' ));
        if(c>='0' && c<='9') return c;
        return null;
    }
}
