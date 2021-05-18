package bt4;

public class FizzBuzzTranslate {
    public static String FizzbuzzNum(int number) {
        String result = "";
        int ones = number % 10;
        int tens = (number % 100) / 10;
        if (ones == 3 || tens == 3) {
            return "Fizz";
        } else if (ones == 5 || tens == 5) {
            return "Buzz";
        } else {
            if (number > 10 && number <100) {
                switch (tens) {
                    case 1:
                        result += "Mười";
                        break;
                    case 2:
                        result += "Hai";
                        break;
                    case 4:
                        result += "bốn";
                        break;
                    case 6:
                        result += "sáu";
                        break;
                    case 7:
                        result += "bảy";
                        break;
                    case 8:
                        result += "tám";
                        break;
                    case 9:
                        result += "chín";
                        break;
                    default:
                        return result;
                }
            }
            else {
                return  result = "không có số phù hợp";
            }
            switch (ones) {
                case 1:
                    result += "một";
                    break;
                case 2:
                    result += "Hai";
                    break;
                case 4:
                    result += "bốn";
                    break;
                case 6:
                    result += "sáu";
                    break;
                case 7:
                    result += "bảy";
                    break;
                case 8:
                    result += "tám;";
                    break;
                case 9:
                    result += "chín";
                    break;
            }
            return result;
        }
    }
}

    

