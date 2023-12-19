public class CompanyProgram{
    public static void main(String[] args){
        ICeo bossPerson = new Ceo();

        bossPerson.salary();
        bossPerson.addBonus();
        bossPerson.makeDecisions();
        bossPerson.addStocks();
    }
}