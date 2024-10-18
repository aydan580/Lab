## Отчет по лабораторной работе № 1

#### № группы: `ПМ-2403`

#### Выполнил: `Алиева Айдан Мобил кызы`

#### Вариант: `1`

### Cодержание:

- [Постановка задачи](#1-постановка-задачи)
- [Входные и выходные данные](#2-входные-и-выходные-данные)
- [Выбор структуры данных](#3-выбор-структуры-данных)
- [Алгоритм](#4-алгоритм)
- [Программа](#5-программа)
- [Анализ правильности решения](#6-анализ-правильности-решения)

### 1. Постановка задачи

> Необходимо определить, через какое количество отверстий удастся протащить шарик, имеющий диаметр 𝑋, через последовательность отверстий с диаметрами 𝐴, 𝐵, 𝐶, и 𝐷. Шарик может пройти через отверстие, только если его диаметр меньше или равен диаметру отверстия.

Подробное описание
Если диаметр шарика 𝑋 больше диаметра отверстия, то шарик не сможет пройти через это отверстие. Если диаметр шарика меньше или равен диаметру отверстия, то он пройдет через него. Наша задача заключается в том, чтобы подсчитать, через сколько отверстий шарик пройдет.

### Примеры:
1. Вход: 𝑋=3, 𝐴=4, 𝐵=2, 𝐶=5, 𝐷=3
Выход: 3 (Шарик пройдет через отверстия 𝐴, 𝐶 и 𝐷).
2. Вход: 𝑋=6, 𝐴=5, 𝐵=6, 𝐶=4, 𝐷=7
Выход: 2 (Шарик пройдет через отверстия 𝐵 и 𝐷).

### 2. Входные и выходные данные

#### Данные на вход

– Тип данных: Целые числа.
– Количество: Пять целых чисел (одно значение для диаметра шарика и четыре значения для диаметров отверстий).
– Диапазон значений:
– 𝑋 (диаметр шарика): натуральные числа, 𝑋≥1
– 𝐴,𝐵,𝐶,𝐷 (диаметры отверстий): натуральные числа, 𝐴,𝐵,𝐶,𝐷≥1.

#### Данные на выход
– Тип данных: Целое число.
– Описание: Количество отверстий, через которые шарик сможет пройти.
– Диапазон значений: От 0 до 4 (отсутствие прохода или проход через все отверстия).

Математическая модель заключается в следующем:
– Для каждого отверстия 𝐴, 𝐵, 𝐶, и 𝐷 проверять, выполняется ли условие 𝑋≤диаметр отверстия.
– Подсчитывать количество щелей, соответствующих этому условию.

### 3. Выбор структуры данных

Я буду использовать обычные переменные для хранения ввода и счётчика для подсчета числа отверстий, через которые может пройти шарик:
– Переменные для размеров: 𝑋, 𝐴, 𝐵, 𝐶, 𝐷.
– Счётчик тип данных int для хранения количества прошедших отверстий.

### 4. Алгоритм

#### Алгоритм выполнения программы:
1)Ввести натуральные числа X, A, B, C, D.
2)Установить счетчик количество отверстий = 0.
3)Если X <= A: - Увеличить количество отверстий на 1.              Иначе: - Перейти к шагу 8.                   
4)Если X <= C: - Увеличить количество отверстий на 1.              Иначе: - Перейти к шагу 8.
5)Если X <= D: - Увеличить количество отверстий на 1.
6) Вывести количество отверстий.
7)Конец алгоритма
### Блок-схема
```mermaid
flowchart TD
    A[Ввод: натуральные числа X, A, B, C, D] --> B{X <= A?}
    B -->|нет| C[Количество отверстий: 0]
    B -->|да| D{X <= B?}
    D -->|нет| C1[Количество отверстий: 1]
    D -->|да| E{X <= C?}
    E -->|нет| C2[Количество отверстий: 2]
    E -->|да| F{X <= D?}
    F -->|нет| C3[Количество отверстий: 3]
    F -->|да | C4[Количество отверстий: 4]
  ```
### 5. Программа

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);
        // Ввод диаметров
        System.out.print("Введите диаметр шарика (X): ");
        int X = scanner.nextInt();
        System.out.print("Введите диаметры отверстий (A, B, C, D): ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        // Инициализация счетчика
        int counter = 0;
        // Проверка каждого отверстия
        if (A >= X) {
            counter++;
        }
        if (B >= X) {
            counter++;
        }
        if (C >= X) {
            counter++;
        }
        if (D >= X) {
            counter++;
        }
        // Вывод результата
        System.out.println("Количество отверстий, через которые удастся протащить шарик: " + counter);
        // Закрытие Scanner
        scanner.close();
    }
}
```

### 6. Анализ правильности решения

Программа работает корректно на всем множестве решений с учетом ограничений.

1. Первый тест:

    - **Input**:
        ```
        3 4 2 5 3
        ```

    - **Output**:
        ```
        3
        ```
 Результат: 3 (верно, шарик пройдет через A, C, D)

2. Второй тест:

    - **Input**:
        ```
        6 5 6 4 7
        ```

    - **Output**:
        ```
        2
        ```
  Результат: 2 (верно, шарик пройдет через B и D)

3. Третий тест:

    - **Input**:
        ```
        1 1 1 1 1 
        ```

    - **Output**:
        ```
        4
        ```
  Результат: 4 (верно, шарик пройдет через все отверстия)

4. Тест на `X = 0` или `Y = 0`:

    - **Input**:
        ```
        5 2 3 4 1
        ```

    - **Output**:
        ```
        0
        ```
 Результат: 0 (верно, шарик не пройдет ни через одно отверстие). 

