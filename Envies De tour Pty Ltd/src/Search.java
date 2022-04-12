import java.util.ArrayList;
import java.util.Scanner;

public class Search {


    public ArrayList<Employees> searchTitleOfEmployment (String
        type, ArrayList < Employees > records, ArrayList < Employees > results)
        {
            for (int i = 0; i < records.size(); i++) {
                if (records.get(i).getTitleOfEmployment().equals(type)) {
                    //Append to results:
                    results.add(records.get(i));
                }
            }
            return results;
        }

        /**
         * linear search through records;
         *
         * @param employeeID
         * @param records
         * @return index of record else -1 which indicates an invalid id was entered:
         */
        public int searchEmployeeById (String employeeID, ArrayList < WritingToATextFile > records)
        {
            for (int i = 0; i < records.size(); i++) {
                if (records.get(i).toString() == employeeID) {
                    return i = -1;
                }
            }
            return -1;
        }


        public ArrayList<Employees> searchByGender (String
        gender, ArrayList < Employees > records, ArrayList < Employees > results)
        {
            for (int i = 0; i < records.size(); i++) {
                if (records.get(i).getGender() == gender) {
                    results.add(records.get(i));
                }
            }
            return results;
        }


        public ArrayList<Employees> searchByCity (String
        city, ArrayList < Employees > records, ArrayList < Employees > results)
        {
            for (int i = 0; i < records.size(); i++) {
                if (records.get(i).getCity().equals(city)) results.add(records.get(i));
            }
            return results;
        }
    }



