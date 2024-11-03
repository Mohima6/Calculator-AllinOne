import java.util.Scanner;

public class EnhancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enhanced Calculator Menu:");
            System.out.println("1.Basic Operations");
            System.out.println("2. Solve Quadratic Equation");
            System.out.println("3.Calculate Percentage");
            System.out.println("4.Loan Amortization Schedule");
            System.out.println("5.Unit Converter");
            System.out.println("6.Statistics Calculator");
            System.out.println("7.Time Zone Converter");
            System.out.println("8.Solve Linear Equation");
            System.out.println("9.Area and Perimeter of Shapes");
            System.out.println("10. Power Calculation");
            System.out.println("11. Square Root Calculation");
            System.out.println("12. Factorial Calculation");
            System.out.println("13. Fibonacci Series Generator");
            System.out.println("14. GCD and LCM Calculation");
            System.out.println("15. Logarithm Calculation");
            System.out.println("16. Trigonometric Functions (Sine, Cosine, Tangent)");
            System.out.println("17. Exponential Function");
            System.out.println("18.Convert Decimal to Binary, Octal, Hexadecimal");
            System.out.println("19.Convert Binary, Octal, Hexadecimal to Decimal");
            System.out.println("20. Currency Converter");
            System.out.println("21. Interest Calculator");
            System.out.println("22.Age Calculator");
            System.out.println("23. Temperature Converter");
            System.out.println("24. Date Difference Calculator");
            System.out.println("25. Random Number Generator");
            System.out.println("26. Weather Condition Calculator");
            System.out.println("27. Periodic Table Lookup (Basic)");
            System.out.println("28. Volume Calculations");
            System.out.println("29. Budgeting Tool");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");


    choice = getVaildIntegerInput(scanner);
    switch (choice) {
        case 1:
            performBasicOperations(scanner);
            break;

        case 2:
            solveQuadraticEquation(scanner);
            break;

        case 3:
            calculatePercentage(scanner);
            break;

        case 4:
            loanAmortizationSchedule(scanner);
            break;

        case 5:
            unitConverter(scanner);
            break;

        case 6:
            statisticsCalculator(scanner);
            break;

        case 7:
            timeZoneConverter(scanner);
            break;
        
        case 8:
            solveLinearEquation(scanner);
            break;
        
        case 9:
            areaAndPerimeter(scanner);
            break;

        case 10:
            powerCalculation(scanner);
            break;

        case 11:
            squareRootCalculation(scanner);
            break;

        case 12:
            factorialCalculation(scanner);
            break;

        case 13:
            fibonacciGenerator(scanner);
            break;
        
        case 14:
             gcdLcmCalculation(scanner);
             break;
        case 15:
             logarithmCalculation(scanner);
             break;
        case 16:
            trigonometricFunctions(scanner);
            break;
        case 17:
            exponentialFunction(scanner);
            break;
        case 18:
            convertDecimal(scanner);
            break;
        case 19:
            convertBase(scanner);
            break;
        case 20:
            currencyConverter(scanner);
            break;
        case 21:
            interestCalculator(scanner);
            break;
        case 22:
            ageCalculator(scanner);
            break;
        case 23:
            temperatureConverter(scanner);
            break;
        case 24:
            dateDifferenceCalculator(scanner);
            break;
        case 25:
            randomNumberGenerator(scanner);
            break;
        case 26:
            weatherConditionCalculator(scanner);
            break;
        case 27:
            periodicTableLookup(scanner);
            break;
        case 28:
            volumeCalculations(scanner);
            break;
        case 29:
            budgetingTool(scanner);
            break;

        case 0:
            System.out.println("Exiting the calculator. Goodbye!");
            break;

        default:
        System.out.println("Invalid choice.Please try again.");       
    } 
}  
while (choice != 0);

    } 

    private static void performBasicOperations(Scanner scanner){
        System.out.println("Basic Operations:");
        System.out.println("Enter first number:");

        double num1 = getVaildDoubleInput(scanner);
        System.out.println("Enter second number:");
        double num2 = getVaildDoubleInput(scanner);

        System.out.printf("Addition:%.2f%n", num1+num2);
        System.out.printf("Subtraction: %.2f%n", num1-num2);
        System.out.printf("Multiplication: %.2f%n", num1*num2);
        System.out.printf("Division: %.2f%n", num1/num2);
    }

     private static void solveQuadraticEquation(Scanner scanner){
        System.out.println("Solve Quadratic Equation (ax^2 + bx + c = 0)");
        System.out.print("Enter a: ");
        double a = getVaildDoubleInput(scanner);
        System.out.print("Enter b: ");
        double b = getVaildDoubleInput(scanner);
        System.out.print("Enter c: ");
        double c = getVaildDoubleInput(scanner);

        double discriminant = b*b - 4 * a * c ;
        if (discriminant>0) {
            double root1 = (-b+ Math.sqrt(discriminant)) / (2 * a);
            double root2 =  (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.printf("Roots are real and different: %.2f, %.2f%n" ,  root1,root2);

        }   else if (discriminant==0) {
            double root = -b/ (2*a);
            System.out.printf("Roots are real and the same:%.2f%n", root);

            } else {
            System.out.println("No real roots.");
        }
               
    }

    private static void calculatePercentage(Scanner scanner){
        System.out.println("Enter total: ");
        double total = getVaildDoubleInput(scanner);
        System.out.print("Enter percent to calculate: ");
        double percentage = getVaildIntegerInput(scanner);
        System.out.printf("%.2f%% of %.2f is %.2f%n", percentage, total, (percentage/100)*total );
    }
private static void loanAmortizationSchedule(Scanner scanner){
        System.out.print("Enter loan amount: ");
        double principal = getVaildDoubleInput(scanner);
        System.out.print("Enter annual interest rate (in%): ");
        double annualRate = getVaildDoubleInput(scanner);
        System.out.print("Enter loan term(in years): ");
        int years = getVaildIntegerInput(scanner);

        double monthlyRate = (annualRate/100) / 12 ;
        int months = years*12;
        double monthlyPayment = (principal*monthlyRate) / (1-Math.pow(1+monthlyRate, -months));
        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
    }

    private static void unitConverter(Scanner scanner){
        System.out.print("Enter value in meters to convert to kilometers: ");
        double meters = getVaildDoubleInput(scanner);
        System.out.printf("%.2f meters = %.2f kilometers%n", meters, meters/1000);
        System.out.print("Enter value in grams to convert ");
    }



