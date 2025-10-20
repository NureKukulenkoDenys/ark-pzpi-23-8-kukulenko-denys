// ---------- 1.2.2  Структура коду ----------
/* Хороший код */
// Пакет моделей користувачів
package com.example.models;

// Кожен клас розміщується в окремому файлі з відповідною назвою
public class User {

    private String name;
    private int age;

    // Конструктор класу
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для отримання імені користувача
    public String getName() {
        return name;
    }

    // Метод для отримання віку користувача
    public int getAge() {
        return age;
    }
}


/* Поганий код */
// Усі класи розміщені в одному файлі — це порушує конвенції Java
public class User {
    String name;
    int age;
}

public class Order {
    int id;
    double price;
}

public class Product {
    String title;
    double cost;
}


// ---------- 1.2.3 Форматування коду ----------
/* Хороший код */
for (int i = 0; i < 10; i++) {
    System.out.println("Iteration: " + i);

    if (i % 2 == 0) {
        System.out.println("Even number");
    } else {
        System.out.println("Odd number");
    }
}


/* Поганий код */
for(int i=0;i<10;i++){System.out.println("Iteration:"+i);if(i%2==0){System.out.println("Even number");}else{System.out.println("Odd number");}}


// ---------- 1.2.4 Іменування ----------
/* Хороший код */
// camelCase для змінних і методів
double accountBalance;
String accountHolderName;

public void depositAmount(double amount) {
    accountBalance += amount;
}

// PascalCase для класів
public class BankAccount {
    private String holderName;
    private double balance;
}

// UPPER_SNAKE_CASE для констант
public static final double MINIMUM_BALANCE = 100.0;


/* Поганий код */
// неправильний стиль іменування змінних і методів
double Account_Balance;
String Accountholdername;

public void Deposit_Amount(double Amount) {
    Account_Balance += Amount;
}

// неправильний стиль іменування класів
public class bank_account {
    String Holdername;
    double Balance;
}

// неправильний стиль для констант
public static final double minimumbalance = 100.0;


// ---------- 1.2.5 Коментарі ----------
/* Хороший код */
// Створюємо новий користувацький акаунт і відправляємо підтвердження на email
User newUser = userService.registerUser("john.doe@example.com");

// Логування події створення акаунта для аудиту
logger.info("New user registered: " + newUser.getEmail());

// Перевіряємо, чи користувач має права адміністратора
if (newUser.isAdmin()) {
    grantAdminAccess(newUser);
}


/* Поганий код */
// newUser
User newUser = userService.registerUser("john.doe@example.com");

// logger
logger.info("New user registered: " + newUser.getEmail());

// Якщо користувач адміністратор
if (newUser.isAdmin()) {
    grantAdminAccess(newUser);
}


// ---------- 1.2.6 Документування коду ----------
/**
 * Обчислює знижку для клієнта на основі суми покупки.
 *
 * @param amount сума покупки у гривнях
 * @return розмір знижки у відсотках
 * @since 1.0
 * @see Customer
 */
public int calculateDiscount(double amount) {
    if (amount >= 200) {
        return 15;
    } else if (amount >= 100) {
        return 10;
    } else {
        return 0;
    }
}


// ---------- 1.2.8 Кодування на основі тестування (TDD) ----------
/* Хороший тест */
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    @Test
    void testIsPrime() {
        assertTrue(PrimeChecker.isPrime(7));
        assertFalse(PrimeChecker.isPrime(10));
    }
}


/* Реалізація */
public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}


// ---------- 1.2.10 Приклади оформлення коду ----------
/* Хороший код */
public class NumberUtils {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printNumberInfo(int number) {
        System.out.println("Number: " + number);
        System.out.println("Even: " + isEven(number));
    }
}

class ProperUser(val name: String, val age: Int)

/* Поганий код */
class N {
    static boolean e(int n) { return n % 2 == 0; }
    static void p(int n) { System.out.println(n); System.out.println(e(n)); }
}

