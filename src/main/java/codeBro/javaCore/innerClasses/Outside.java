package codeBro.javaCore.innerClasses;

public class Outside {
    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    String h = "hello ";
    Inside ins = new Inside();


    public void outsMet() {

        ins.greetings();
    }


    public class Inside {
        String w = "world";

        public String getW() {
            return w;
        }

        public void setW(String w) {
            this.w = w;
        }

        public void greetings() {
            System.out.println(h + w);
        }
    }
}
