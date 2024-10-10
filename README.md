# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 3단계 자동차 경주 사용자 유즈케이스
1. 자동차 경주 시작하기
   사용자는 프로그램을 실행하여 자동차 경주를 시작
2. 자동차 대수 입력
   프로그램이 사용자에게 "자동차 대수는 몇 대 인가요?"라는 질문을 출력
   사용자는 경주에 참여할 자동차 대수를 입력
3. 경주 시도 횟수 입력
   프로그램이 사용자에게 "시도할 횟수는 몇 회 인가요?"라는 질문을 출력
   사용자는 경주 시도 횟수를 입력
4. 경주 준비
   프로그램은 입력된 자동차 대수와 시도 횟수에 따라, 자동차 상태를 저장할 배열을 생성
   모든 자동차의 초기 위치를 ""으로 설정
5. 경주 시작
   프로그램은 경주 시도 횟수만큼 반복하여 각 자동차에 대해 랜덤한 값(1~9)을 발생
   각 자동차의 랜덤 값이 특정 기준(4 이상)에 해당하면 자동차는 한 칸 전진
   프로그램은 이 상태 변화를 기록하고 저장
6. 경주 결과 출력
   모든 시도가 끝나면 프로그램은 각 자동차의 이동 경로를 화면에 출력

## 3단계 자동차 경주 구현할 기능 목록
1. 자동차 대수를 입력받을 메서드
2. 자동차 이동을 시도할 횟수를 입력받을 메서드
3. 자동차들의 상태 정보를 저장할 배열을 생성하는 메서드
4. 랜덤한 값을 발생시킬 메서드
5. 넘겨받은 값을 기준으로 자동차 전진 여부를 결정하는 메서드
6. 자동차들이 움직인 상태를 저장하는 메서드
7. 실행결과(자동차 이동 결과)를 출력하는 메서드

## 4단계 자동차 경주(우승자) 사용자 유즈케이스
1. 자동차 경주 시작하기
   사용자는 프로그램을 실행하여 자동차 경주를 시작
2. 쉼표를 기준으로 자동차 이름을 입력
   프로그램이 사용자에게 "경주할 자동차 이름을 입력하세요"라는 질문을 출력
   사용자는 경주에 참여할 자동차 대수를 입력
3. 경주 시도 횟수 입력
   프로그램이 사용자에게 "시도할 횟수는 몇 회 인가요?"라는 질문을 출력
   사용자는 경주 시도 횟수를 입력
4. 경주 준비
   프로그램은 입력된 자동차 대수와 시도 횟수에 따라, 자동차의 기록을 저장할 리스트를 생성
   모든 자동차의 초기 위치를 0으로 설정
5. 경주 시작
   프로그램은 경주 시도 횟수만큼 반복하여 각 자동차에 대해 랜덤한 값(1~9)을 발생
   각 자동차의 랜덤 값이 특정 기준(4 이상)에 해당하면 자동차는 한 칸 전진(거리 1 증가)
   프로그램은 이 상태 변화를 리스트에 저장
6. 경주 결과 출력
   모든 시도가 끝나면 프로그램은 각 자동차의 이동 결과를 화면에 출력

## 4단계 자동차 경주(우승자) 구현 및 수정할 기능 목록
1. 경주할 자동차 이름을 입력받을 메서드(이름은 쉼표(,)를 기준으로 구분)
   -> 기존 3단계 자동차 대수 입력받는 메서드 주석처리하고 새로운 메서드 생성
   -> 입력받은 이름은 5글자를 초과할 수 없고, 빈문자열일 수 없음
2. 실행결과(자동차 이동 결과)를 출력하는 메서드 수정
   -> 자동차 이름 : 자동차 이동결과 + 우승자 출력하도록 수정
3. 이동한 거리를 기준으로 우승자를 결정하는 메서드 