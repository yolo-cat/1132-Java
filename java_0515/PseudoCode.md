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

4. 定義 Gym 類別
    - 方法: battle(pokemon1, pokemon2)
        - 隨機決定先攻
        - 判斷勝負規則:
            - 若 level 不同，level 高者勝
            - 若 level 相同，比較 (attackPower - defencePower)
            - 若上述皆相同，隨機決定勝負
        - 回傳勝利寶可夢

5. 主程式流程
    - 選擇並建立寶可夢1 (Pickachu 或 Psyduck)
    - 顯示寶可夢1資訊
    - 選擇並建立寶可夢2 (Pickachu 或 Psyduck)
    - 顯示寶可夢2資訊
    - 進行對戰，顯示對戰結果
    - 顯示寶可夢1資訊
    - 顯示寶可夢2資訊
    - 顯示對戰結束
