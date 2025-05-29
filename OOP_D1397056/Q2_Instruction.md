請設計一個賽車遊戲，遊戲中有 Car 類別代表賽車，CarUtil 類別負責生成賽車屬性，並設計 Track 類別進行比賽。使用者透過 console
輸入兩台賽車的名稱，遊戲會自動生成這兩台賽車的屬性，並在比賽後顯示勝利者的名稱與馬力。
功能需求：

1. Car 類別
   ⚫ 屬性：
   ✓ 名稱(name): String
   ✓ 車款(model): String（隨機生成："Sports Car"、"Sedan" 或 "SUV"）
   ✓ 馬力(horsepower): int（150~200 隨機生成馬力）
   ✓ 加速劑(boost): int（0~3 隨機生成加速劑）
   ⚫ 建構方法：
   ✓ Car(String name)：接收賽車名稱作為參數，並在建構方法內呼叫 CarUtil 的靜態方法初始化 車款、馬力、加速劑。
   ⚫ 方法：
   ✓ getFinalHorsePower()：計算使用所有加速劑後的最終馬力，每個加速劑增加 5 馬力。
2. CarUtil 類別
   ⚫ 提供以下靜態方法，隨機生成賽車屬性：
   ✓ getRandomModel()：隨機回傳 "Sports Car"、"Sedan" 或 "SUV"。
   ✓ getRandomHorsePower()：隨機生成 150~200 之間的馬力。
   ✓ getRandomBoost()：隨機生成 0~3 之間的加速劑數量。
3. Track 類別
   ⚫ 設計一個靜態方法 race(Car car1, Car car2)，接收兩台賽車物件並按照以下規則比賽決定哪台車勝出：
   ✓ 先比最終馬力：用完加速劑後的馬力高者勝出。
   ✓ 若馬力相同：車款優劣排序：Sports Car > Sedan > SUV。
   ✓ 若車款也相同：隨機選擇一台賽車勝出。
4. CarGame 類別，在 main 方法中完成下列動作：
   ⚫ 使用者輸入兩輛賽車的名稱。
   ⚫ 程式自動生成這兩台賽車的車款、馬力與加速劑數量。
   ⚫ 使用 Track 進行比賽，並根據規則決定勝負。
   ⚫ 印出比賽結束後的勝者名稱、車款與最終馬力。
5. 輸入與輸出範例：
   輸入：
   請輸入第一輛賽車的名稱: Lightning
   請輸入第二輛賽車的名稱: Storm
   輸出：
   第一輛賽車: Lightning (Sports Car)
   馬力: 185, 加速劑數量: 2
   第二輛賽車: Storm (SUV)
   馬力: 175, 加速劑數量: 3
   比賽結束！
   獲勝者是: Lightning (Sports Car)，馬力: 185