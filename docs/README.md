# Kotlin-Blackjack

### 기능 요구 사항

- [ ] 이름을 받는다
  - 쉼표로 이름을 구분한다.
  - 문자열이 아닌 경우 재입력 처리한다.
- [ ] 카드를 나누어 준다
  - [ ]성 53장의 카드 리스트를 생성한다.
  - [ ] 카드를 랜덤으로 1장 뽑고, 카드리스트에서 제거한다.
  - [ ] 딜러가 2장의 카드를 각 플레어와 딜러에게 나누어준다.
- [ ] 처음 받은 두장의 카드를 출력해준다.
- [ ] 카드의 합이 21 초과인지 확인한다.
- [ ] 플레이어 마다 더 받을지 말지 판단한다.
- [ ] 딜러가 카드를 받을지 말지 판단한다.
  - [ ] 카드의 합이 17이상인지 확인한다.
- [ ] 총 결과를 출력한다
- [ ] 승패를 출력한다
  - [ ] 딜러의 합과 플레이어의 합을 비교한다.
  - [ ] 딜러만 카드의 합이 21이상이면 딜러가 패배한다.
  - [ ] 플레이어만 카드의 합이 21 이상이면 플레이어가 패배한다.
  - [ ] 둘다 21넘으면 무승부이다
  - [ ] 카드의 합이 같으면 무승부이다

- 플레이어
  - [ ] 이름을 가지고 있다
  - [ ] 21이상인지 플레이어가 판단한다.
  - [ ] 더 받을지 말지 판단한다.
- 딜러
  - [ ] 플레이어에게 카드를 나눠준다.
  - [ ] 플레이어와 승패를 판단한다.
- Cards
  - [ ] 총합을 계산한다.
  - [ ] 2장 이상인지 판단한다.
- CardDrawer
  - [ ] 53장 카드리스트를 생성한다
  - [ ] 카드를 랜덤으로 한장 뽑고 카드리스트에서 제거한다
- CardCategory
  - [ ] 카드 문양 정보를 담고있는 enum 클래스
- CardNumber
  - [ ] 카드 숫자 정보를 담고있는 enum 클래스