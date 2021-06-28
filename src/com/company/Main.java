package com.company;

public class Main {

    public static void main(String[] args) {
        int firstValue;
        int secondValue;
        int answer;

        //initialize variables
        firstValue = 22;
        secondValue = 7;
        answer = 0;

        //      String operator = "p";
        int operator = Math.max(firstValue, secondValue);
        //       System.out.println(doArithmetic(firstValue, secondValue, operator));
        System.out.println(doMinMax(firstValue, secondValue, operator));
    }

        public static double doMinMax (int firstValue, int secondValue, int operator){
            double answer;
            answer = 0;
            switch (operator) {
                case Math.max(firstValue, secondValue):
                    return answer;
                    break;
                case Math.min(firstValue, secondValue):
                    return answer;
                break;
                default:
                    System.out.println("Enter numbers");
                    break;
            }
            return answer;
        }

    //public static double doArithmetic(double firstNumber, double secondNumber, String operator) {
      //  double answer;
     //   answer = 0;
      //  switch (operator) {
      //      case "+":
      //          answer = firstNumber + secondNumber;
                //   System.out.println(answer)
      //          return answer;
      //      case "-":
      //          answer = firstNumber - secondNumber;
                //   System.out.println(answer)
      //          return answer;
       //     case "*":
       //         answer = firstNumber * secondNumber;
                //   System.out.println(answer)
       //         return answer;
       //     case "/":
         //       answer = firstNumber / secondNumber;
                //   System.out.println(answer);
         //       return answer;

        //    default:
         //       System.out.println("Enter a valid operator");
         //       break;
       // }
      //  return answer;
        //Create.
        // a method that checks two numbers and uses a switch to return max, min on that number.

    }

