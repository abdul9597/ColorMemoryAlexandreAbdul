package com.example.colormemoryalexandreabdul;

public class Rule {
    private double Score;
    private double Mode;
    private int Life;
    private long TimeReact = 0;
    private int BlocInit = 0;
    private int BlocEnd = 0;
    private int level = 0;
    private RandomSequencer RandomSequencer ;
    private BlocPosition BlocPosition;

    public Rule () {}

    public Rule (int choice){
        switch (choice) {
            case 1: EasyMode();
                    break;
            case 2: MediumMode();
                    break;
            case 3: HardMode();
                    break;
            case 4: ChronosMode();
                    break;
        }


    }

    private void EasyMode(){
        Mode = 1;
        Life = 2;
        Score = 0;
        BlocInit = 1;
        BlocEnd = 8;
        level = 1;
        RandomSequencer = new RandomSequencer();
        BlocPosition = new BlocPosition();
    }
    private void MediumMode(){
        Mode = 1.5;
        Life = 2;
        Score = 0;
        BlocInit = 3;
        BlocEnd = 12;
        level = 1;
        RandomSequencer = new RandomSequencer();
        BlocPosition = new BlocPosition();
    }
    private void HardMode(){
        Mode = 2;
        Life = 3;
        Score = 0;
        BlocInit = 5;
        BlocEnd = 15;
        level = 1;
        RandomSequencer = new RandomSequencer();
        BlocPosition = new BlocPosition();
    }

}
