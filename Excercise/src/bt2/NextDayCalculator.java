package bt2;

public class NextDayCalculator {
    public static boolean check(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public static String Nextday(int day, int mounth, int year) {
        switch (mounth) {
            case 2:
                if (check(year)) {
                    if (day == 29) {
                        day = 1;
                        mounth += 1;
                        return "Nextday is " + day + "/" + mounth + "/" + year;
                    } else if (day > 0 && day < 29) {
                        day += 1;
                        return "Next day is " + day + "/" + mounth + "/" + year;
                    } else {
                        return "Số ngày không hợp lệ";
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    mounth += 1;
                    return "Nextday is " + day + "/" + mounth + "/" + year;
                } else if (day > 0 && day < 31) {
                    day += 1;
                    return "Next day is " + day + "/" + mounth + "/" + year;
                } else {
                    return "Số ngày không hợp lệ";
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    mounth += 1;
                    return "Nextday is " + day + "/" + mounth + "/" + year;
                } else if (day > 0 && day < 30) {
                    day += 1;
                    return "Next day is " + day + "/" + mounth + "/" + year;
                } else {
                    return "Số ngày không hợp lệ";
                }
            case 12:
                if (day == 31) {
                    day = 1;
                    mounth = 1;
                    year += 1;
                    return "Nextday is " + day + "/" + mounth + "/" + year;
                } else if (day > 0 && day < 31) {
                    day += 1;
                    return "Nextday is" + day + "/" + mounth + "/" + year;
                } else return "Số ngày không hợp lệ";
        }
    return "none";
    }


}