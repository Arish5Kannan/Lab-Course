class superr
        {
            public void show()
            {
                System.out.println("I am a Sub class");
            }
            final void reveal()
            {
                System.out.println("I am a final method");
            }

        }
        class inheritance extends superr
        {
            @Override
            public void show() {
                System.out.println("I am overrided method from superr class");
            }
        }
        class finalMethod
        {
            public static void main(String[] args) {
                inheritance o = new inheritance();
                o.show();
                o.reveal();
            }
        }