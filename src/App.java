public class App {
    public static void main(String[] number) throws Exception {
        int numberForTable = 4; //numero utilizado para tabela de multiplicação
        int numberOfLoops = 9;
        String header = "Tabela de multiplicação de " + numberForTable;

        System.out.println(header);

        for(int i = 0; i<numberOfLoops; i++){

            int numberForMultiplication = i + 1;
            int multiplicationResult = numberForMultiplication * numberForTable;
            
            System.out.println(numberForMultiplication + " X " + numberForTable + " = " + multiplicationResult);

        };        
    }
}
