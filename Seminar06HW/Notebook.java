package JAVA_Seminars.Seminar06HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Notebook {
    private int DisplaySize;
    private int RAM;
    private int HDD;
    private String CPU;
    private String OS;
    private String Color;

    public Notebook(int DisplaySize, int RAM, int HDD, String CPU, String OS, String Color) {
        this.DisplaySize = DisplaySize;
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
        this.OS = OS;
        this.Color = Color;
    }

    public int getDisplaySize() {
        return DisplaySize;
    }

    public void setDisplaySize(int size) {
        this.DisplaySize = size;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int value) {
        this.RAM = value;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int value) {
        this.HDD = value;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String type) {
        this.CPU = type;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String type) {
        this.OS = type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public static HashSet<Notebook> notebooks = new HashSet<>();

    public static void Add(int DisplaySize, int RAM, int HDD, String CPU, String OS, String Color) {
        notebooks.add(new Notebook(DisplaySize, RAM, HDD, CPU, OS, Color));
    }

    public static Scanner input = new Scanner(System.in, "Cp866");

    public static void Requests() {
        System.out.print("(1)Точный запрос (2)Расширенный запрос: ");
        String menu = input.nextLine();
        switch (menu) {
            case ("1"):
                Filter(Request(), notebooks);
                break;
            case ("2"):
                extendedFilter(extendedRequest(), notebooks);
                break;
            default:
                System.out.println("Нет такой команды");
                break;
        }
    }

    public static void parameterInput(String text, HashMap<String, String> request, String key) {
        System.out.print(text);
        String value = input.nextLine();
        if (value == null || value.length() == 0) {
            request.put(key, "0");
        } else {
            request.put(key, value);
        }
    }

    public static HashMap<String, String> textRequest(HashMap<String, String> request) {
        System.out.print("Производитель процессора (intel, AMD): ");
        request.put("CPU", input.nextLine());
        System.out.print("Тип системы (win10, win11, none): ");
        request.put("OS", input.nextLine());
        System.out.print("Цвет корпуса (чёрный, серый, и т.п): ");
        request.put("Color", input.nextLine());
        return request;
    }

    public static HashMap<String, String> Request() {
        HashMap<String, String> Request = new HashMap<>();
        System.out.println("Введите параметры для поиска или оставьте пустыми");
        parameterInput("Диагональ дисплея: ", Request, "DisplaySize");
        parameterInput("Объем оперативной памяти: ", Request, "RAM");
        parameterInput("Объем жесткого диска: ", Request, "HDD");
        textRequest(Request);
        return Request;
    }

    public static HashMap<String, String> extendedRequest() {
        HashMap<String, String> extendedRequest = new HashMap<>();
        System.out.println("Введите параметры для поиска или оставьте пустыми");
        parameterInput("Минимальная диагональ дисплея: ", extendedRequest, "DisplaySize");
        parameterInput("Минимальный объем оперативной памяти: ", extendedRequest, "RAM");
        parameterInput("Минимальный объем жесткого диска: ", extendedRequest, "HDD");
        textRequest(extendedRequest);
        return extendedRequest;
    }

    public static void Filter(HashMap<String, String> request, HashSet<Notebook> catalog) {
        Boolean noResultsFlag = true;
        System.out.println("По вашему запросу найдено:");
        for (Notebook item : catalog) {
            if (item.getDisplaySize() == Integer.parseInt(request.get("DisplaySize"))
                    || request.get("DisplaySize") == "0") {
                if (item.getRAM() == Integer.parseInt(request.get("RAM")) || request.get("RAM") == "0") {
                    if (item.getHDD() == Integer.parseInt(request.get("HDD")) || request.get("HDD") == "0") {
                        if (request.get("CPU").equals(item.getCPU()) || request.get("CPU") == "") {
                            if (request.get("OS").equals(item.getOS()) || request.get("OS") == "") {
                                if (request.get("Color").equals(item.getColor()) || request.get("Color") == "") {
                                    System.out.println(item);
                                    noResultsFlag = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (noResultsFlag) {
            System.out.println("Нет техники с такими параметрами");
        }
    }

    public static void extendedFilter(HashMap<String, String> request, HashSet<Notebook> catalog) {
        Boolean noResultsFlag = true;
        System.out.println("По вашему запросу найдено:");
        for (Notebook item : catalog) {
            if (item.getDisplaySize() >= Integer.parseInt(request.get("DisplaySize"))
                    && (item.getRAM() >= Integer.parseInt(request.get("RAM")))
                    && (item.getHDD() >= Integer.parseInt(request.get("HDD")))) {
                if (request.get("CPU").equals(item.getCPU()) || request.get("CPU") == "") {
                    if (request.get("OS").equals(item.getOS()) || request.get("OS") == "") {
                        if (request.get("Color").equals(item.getColor()) || request.get("Color") == "") {
                            System.out.println(item);
                            noResultsFlag = false;
                        }
                    }
                }
            }
        }
        if (noResultsFlag) {
            System.out.println("Нет техники с такими параметрами");
        }
    }

    @Override
    public String toString() {
        return DisplaySize + "' RAM " + RAM + "Gb, HDD " + HDD + "Gb, " + CPU + ", OS " + OS + ", " + Color;
    }
}