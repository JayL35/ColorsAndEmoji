public class Dragon
{
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    private final String RED_FIRE_EMOJI = "\uD83D\uDD25";

    private String name;

    public Dragon(String name)
    {
        this.name = name;
    }

    public void introduce()
    {
        System.out.println(CYAN + "Hello," + RED + " my name is " + BROWN + name);
        System.out.println(BLUE + "and I am" + PURPLE + " a oooo mighty dragon!!");
        System.out.println(WHITE + "ROAARRRR!" + RED_FIRE_EMOJI);
    }

    public void animate() throws InterruptedException
    {
        System.out.print(RED);
        System.out.println("<>=======()");
        System.out.print(CYAN);
        System.out.println("(/\\__   /|\\          ()==========<>_");
        System.out.print(BROWN);
        System.out.println("     \\_/ | \\\\        //|\\   ______/ \\)");
        System.out.print(WHITE);
        System.out.println("       \\_|  \\\\      // | \\_/");
        System.out.print(RED);
        System.out.println("         \\|\\/|\\_   //  /\\/");
        System.out.print(BLACK);
        System.out.println("          (oo)\\ \\_//  /");
        System.out.print(PURPLE);
        System.out.println("         //_/\\_\\/ /  |");
        System.out.print(BLUE);
        System.out.println("        @@/  |=\\  \\  |");
        System.out.print(RED);
        System.out.println("             \\_=\\_ \\ |");
        System.out.print(BROWN);
        System.out.println("               \\==\\ \\|\\_ snd");
        System.out.print(WHITE);
        System.out.println("             __(\\===\\(  )\\\\");
        System.out.print(BLACK);
        System.out.println("            (((~)  __(_/   |");
        System.out.print(BLUE_BRIGHT);
        System.out.println("                  (((~) \\  /");
        System.out.print(PURPLE);
        System.out.println("                 _______/ /");
        System.out.print(BLUE);
        System.out.println("                 '--------'");
        System.out.print(WHITE);
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("<>=======()");
        System.out.print(CYAN);
        System.out.println("(/\\__   /|\\          ()==========<>_");
        System.out.print(BROWN);
        System.out.println("     \\_/ | \\\\        //|\\   ______/ \\)");
        System.out.print(WHITE);
        System.out.println("       \\_|  \\\\      // | \\_/");
        System.out.print(RED);
        System.out.println("         \\|\\/|\\_   //  /\\/");
        System.out.print(BLACK);
        System.out.println("          (oo)\\ \\_//  /");
        System.out.print(PURPLE);
        System.out.println("         //_/\\_\\/ /  |");
        System.out.print(BLUE);
        System.out.println(RED_FIRE_EMOJI + RED_FIRE_EMOJI + RED_FIRE_EMOJI +         "   @@/  |=\\  \\  |");
        System.out.print(RED);
        System.out.println("             \\_=\\_ \\ |");
        System.out.print(BROWN);
        System.out.println("               \\==\\ \\|\\_ snd");
        System.out.print(WHITE);
        System.out.println("             __(\\===\\(  )\\\\");
        System.out.print(BLACK);
        System.out.println("            (((~)  __(_/   |");
        System.out.print(BLUE_BRIGHT);
        System.out.println("                  (((~) \\  /");
        System.out.print(PURPLE);
        System.out.println("                 _______/ /");
        System.out.print(BLUE);
        System.out.println("                 '--------'");
        System.out.print(WHITE);


    }
}
