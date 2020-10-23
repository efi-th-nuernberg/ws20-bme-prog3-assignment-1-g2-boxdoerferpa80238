class Main {
  public static void main(String[] args) {
    System.out.println("Hello Paula!");
    zahlenfilter();
  }

  public static void zahlenfilter(){
        for (int i=0; i<=200; i++){
    System.out.println (i);
    if((i%5)==0 && (i!=0)){
      System.out.println("Zahl ist durch 5 teilbar");
    }
    if (((i-9)%10)==0 && (i!=0)){
      System.out.println("Zahl endet auf 9!");
    }
    if(((i+i)%3)==0 && (i!=0)){
      System.out.println("ZAHL und VORGÄNGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar");
    }
  }
  }
  }
