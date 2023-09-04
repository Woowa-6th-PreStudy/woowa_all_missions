# woowa6th-study

---

## ✔️ 진행 방식
  - 미션은 **기능 요구 사항, 프로그래밍 요구 사항, 과제 진행 요구 사항** 세 가지로 구성되어 있습니다.
  - 세 개의 요구 사항을 만족하기 위해 노력합니다. 특히 기능을 구현하기 전에 **기능 목록을 만들고**, **기능 단위로 커밋 하는 방식**으로 진행합니다.
  - 기능 요구 사항에 기재되지 않은 내용은 스스로 판단하여 구현합니다.

---

## ✔️커밋 컨벤션
  - Git의 커밋 단위는 앞 단계에서 docs/README.md에 정리한 기능 목록 단위로 추가합니다.
  - 커밋 메시지 컨벤션 가이드를 참고해 커밋 메시지를 작성합니다.
  - https://gist.github.com/stephenparish/9941e89d80e2bc58a153 

---

## ✔️ 과제 제출 전 체크 리스트 - 0점 방지
  - 기능 구현을 모두 정상적으로 했더라도 요구 사항에 명시된 출력값 형식을 지키지 않을 경우 0점으로 처리됨에 주의합니다.
  - 기능 구현을 완료한 뒤 아래 가이드에 따라 테스트를 실행했을 때 모든 테스트가 성공하는지 확인합니다.
  - 테스트가 실패할 경우 0점으로 처리되므로, 반드시 확인 후 제출합니다.

### 테스트 실행 가이드
  - 터미널에서 java -version을 실행하여 Java 버전이 11인지 확인합니다. 또는 Eclipse 또는 IntelliJ IDEA와 같은 IDE에서 Java 11로 실행되는지 확인합니다.
  - 터미널에서 Mac 또는 Linux 사용자의 경우 ./gradlew clean test 명령을 실행합니다.
  - Windows 사용자의 경우 gradlew.bat clean test 명령을 실행합니다.
  - 모든 테스트가 아래와 같이 통과하는지 확인합니다.

```html
BUILD SUCCESSFUL in 0s
```

---

## ✔️ 프로그래밍 요구 사항
  - JDK 11 버전에서 실행 가능해야 합니다. JDK 11에서 정상적으로 동작하지 않을 경우 0점 처리됩니다.
  - build.gradle을 변경할 수 없고, 외부 라이브러리를 사용하지 않습니다.
  - 프로그램 종료 시 System.exit()를 호출하지 않습니다.
  - 프로그램 구현이 완료되면 ApplicationTest의 모든 테스트가 성공해야 합니다. 테스트가 실패할 경우 0점 처리됩니다.
  - 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않습니다.

---

## ✔️ 스터디 참여 방법

### 1. 프로젝트를 자신의 계정으로 fork하기
  - 저장소 우측 상단의 fork 버튼을 클릭해 fork합니다.

---

### 2. fork한 저장소를 자신의 컴퓨터로 clone하기
  - 터미널에서 다음 명령을 입력합니다.

```html
git clone https://github.com/{본인_아이디}/{저장소 아이디}.git
ex) git clone https://github.com/woowacourse/java-baseball.git
```

```html
// clone한 폴더로 이동하는 방법
cd {저장소 아이디}
ex) cd java-baseball
```

---

### 3. 기능 구현을 위한 브랜치 생성
  - git은 서로 다른 작업을 하기 위한 별도의 공간을 만들기 위해 브랜치를 생성할 수 있습니다.
  - 터미널에서 다음 명령을 입력해 브랜치를 생성합니다.

```html
git checkout -b {본인 아이디}
ex) git checkout -b javajigi
```

---

### 4. 통합 개발 환경(IDE)으로 가져오기
  - 미션 진행을 위해 clone한 저장소를 자신이 사용하고 있는 통합 개발 환경(IDE)으로 가져옵니다.
  - Eclipse 또는 IntelliJ 등 자신이 사용하는 도구를 사용해서 진행해주세요. 이 문서에서는 IntelliJ를 기준으로 설명합니다.
  - IntelliJ 시작
    - Import Project
    - 앞에서 clone한 폴더 선택
    - "Import Project from external model" 선택 -> Gradle을 선택 -> Next
    - Finish 버튼을 클릭해 가져오기를 완료합니다

---

### 5. 기능 구현
  - 미션 요구사항을 파악해 기능을 구현합니다.

---

### 6. 기능 구현 후 add, commit
  - 기능 구현을 완료한 후 로컬 저장소에 변경된 부분을 반영하기 위해 add, commit 명령을 사용합니다.

```html
git status // 변경된 파일 확인
git add -A(또는 .) // 변경된 전체 파일을 한번에 반영
git commit -m "메시지" // 작업한 내용을 메시지에 기록
```

---

### 7. 본인 원격 저장소에 올리기
  - 로컬에서 commit 명령을 실행하면 로컬 저장소에만 반영되고, 원격 github.com의 저장소에는 반영되지 않습니다.
  - github.com의 저장소에도 동일하게 반영하기 위해 push 명령어를 사용합니다.

```html
git push origin 브랜치이름
ex) git push origin javajigi
```

---

### 8. github 서비스에서 Pull Request를 보낸다.
  - Pull Request는 github에서 제공하는 기능으로 코드리뷰 요청을 보낼 때 사용합니다.
  - Pull Request는 original 저장소(woowacourse의 저장소)의 main 브랜치와 앞 단계에서 생성한 브랜치 이름(앞 단계의 예에서는 javajigi)을 기준으로 합니다.

```html
ex) 미션을 진행한 javajigi/java-baseball javajigi 브랜치 => woowacourse/java-baseball main
브랜치로 Pull Request를 보낸다.
```
  - 브라우저에서 github 저장소에 접근
  - 브랜치를 작업 브랜치로 변경(앞 단계의 예에서는 javajigi)
  - 브랜치 오른쪽에 있는 "New pull request" 버튼 클릭
  - Pull Request 제목은 [$미션제목] $이름 미션 제출합니다. 형식으로 작성해주세요.
  - 현재 미션에서 작업한 내용을 입력하고 "Create pull request" 버튼을 클릭해 Pull Request를 보내주세요.

---

### 9. 8 번까지 셋팅을 마친 후부터는 꼭 pull을 먼저 하고 커밋, 푸쉬를 해주세요.

```html
git pull origin main
```

---

## ✔️출처
  - https://github.com/woowacourse-precourse/java-onboarding
  - https://github.com/woowacourse/woowacourse-docs/tree/main/precourse

---

## ✔️과제 체크

|제출자|1번|2번|3번|4번|5번|6번|7번|8번|9번|10번|
|-----|----|----|----|----|----|----|----|----|----|----|
|홍서진| | | | | | | | | | |
|이승헌| | | | | | | | | | |
|조현아| | | | | | | | | | |
|김영훈| | | | | | | | | | |
|김경훈| | | | | | | | | | |
|박소미| | | | | | | | | | |
