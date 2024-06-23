class p8 {
    private static int count = 0;

    public p8() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        p8 obj1 = new p8();
        p8 obj2 = new p8();
        p8 obj3 = new p8();

        System.out.println("Number of objects created: " + p8.getCount());
    }
}

