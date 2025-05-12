# 🍎 HashMap Practise: Fruits Store

Цей проєкт — навчальна вправа з використання Java `HashMap` для моделювання магазину фруктів.  
Програма дозволяє поповнювати запаси фруктів, додаючи певну кількість одиниць до кожного типу фрукту в сховищі.

---

## 🔧 Опис

Програма працює зі словником (`Map<String, Integer>`), де ключ — це назва фрукту, а значення — його кількість на складі.

Метод `supplyFruits` додає задану кількість одиниць до кожного елемента мапи.

### 📌 Приклад використання:

```java
Map<String, Integer> fruits = new HashMap<>();
fruits.put("apple", 10);
fruits.put("banana", 5);
fruits.put("orange", 7);

supplyFruits(fruits, 5);
➡️ Результат:

apple: 15  
banana: 10  
orange: 12
🔁 Щоб зберегти порядок додавання елементів — використовуйте LinkedHashMap.

### 📁 Структура проєкту

src/
└── solution/
    ├── Main.java
    └── MarketSupplying.java
### 🚀 Запуск
Відкрити проєкт у середовищі (наприклад, IntelliJ IDEA).

Або з терміналу (перебуваючи в папці src):


javac solution/*.java
java solution.Main
### 👩‍💻 Автор
Iryna Kravchenko
### 🔗 GitHub: kravchenko1207
