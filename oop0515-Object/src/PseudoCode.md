1. 定義 Pokemon 類別
    - 屬性: name, level, candy, attackPower, defencePower
    - 方法: 顯示寶可夢資訊

2. 定義 Pickachu 類別 (繼承 Pokemon)
    - name 設為 "皮卡丘"
    - level 隨機 4~6
    - candy 預設 0
    - attackPower 隨機 6~10
    - defencePower 隨機 1~5

3. 定義 Psyduck 類別 (繼承 Pokemon)
    - name 設為 "可達鴨"
    - level 隨機 4~6
    - candy 預設 0
    - attackPower 隨機 1~5
    - defencePower 隨機 6~10

4. 定義 Charmander 類別 (繼承 Pokemon)
    - name 設為 "小火龍"
    - level 隨機 1~3
    - candy 預設 0
    - attackPower 隨機 8~12
    - defencePower 隨機 1~3

5. 定義 Gym 類別
    - 方法: battle(pokemon1, pokemon2)
        - 參數: pokemon1, pokemon2
        - 判斷勝負規則:
            - 若 level 不同，level 高者勝
            - 若 level 相同，比較 (attackPower - defencePower)
            - 若上述皆相同，隨機決定勝負
        - 顯示對戰結果
    - 方法: battle(pokemonList)
        - 參數: pokemonList (多組寶可夢)
        - 依序兩兩對戰，勝者晉級，直到剩下一隻
        - 每場對戰顯示結果與參戰寶可夢資訊
        - 顯示最終贏家資訊

6. 主程式流程
    - 讓使用者選擇寶可夢數量
    - 依序讓使用者選擇寶可夢角色 (Pickachu / Psyduck / Charmander)
    - 生成所有寶可夢
    - 顯示所有寶可夢資訊
    - 進行多組寶可夢對戰
        - 顯示每場對戰結果
        - 每場對戰後顯示參戰寶可夢資訊
    - 顯示贏家資訊
    - 顯示對戰結束
