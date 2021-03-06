# Questions


## Web

### HTTP란?

### HTTP Method 설명

### HTTP 2.0의 특징

### HTTP와 HTTPS의 차이

### 대칭키/공개키

### HTTP Response code 설명

### AJAX란?

### Web Socket이란?

### RESTful API란?
- REST란 REpresentational State Transfer의 약자로, RESTful API는 REST의 기본 원칙을 지킨 API라고 할 수 있음
- REST는 Resource Oriented Architecture로, API 설계의 중심에 Resource가 있고 Method를 통해 이를 처리하는 아키텍처
- RESTful한 API는 무슨 특징이 있는가
    1. 리소스와 행위를 명시적이고 직관적으로 분리
        - 리소스는 URI로 표현되고, 행위는 4가지 Method\(GET, POST, PUT, DELETE\)로 목적을 분명하게 사용

### MVC 패턴이란?
- MVC 패턴은 코드의 재사용에 유용하며, 사용자 인터페이스와 프로그램 개발에 소요되는 시간을 줄여주는 효과적인 설계방식
- 구성요소로 Model, View, Controller가 있음
    - Model은 데이터베이스를 관리하며 데이터를 가공 및 조회
    - View는 사용자에게 보여줄 화면을 구성
    - Controller는 Model과 View 사이에서 정보 교환을 할 수 있도록 연결해주는 역할

### Serialization이란?
- 객체의 상태 또는 데이터 구조를 기록할 수 있는 포맷으로 변환해주는 것
    - 자바 객체를 JSON으로 변환하거나 JSON을 자바 객체로 변환해주는 라이브러리

### Coockie란?

### Web 서버와 WAS의 차이

### SPA란?
- Single Page Application
- 처음 한 번의 페이지 로딩 후 데이터 송수신만으로 돌아가는 웹 어플리케이션

### CSR/SSR


## Network

### OSI 7계층은?

### TCP/IP 계층은?

### 3-way handshake / 4-way handshake는?

### TCP와 UDP에 대한 설명과 둘의 차이 

### TCP의 특징 2가지
1. 흐름제어: 서버와 클라이언트 간 데이터 처리 속도 조절
    - Stop and Wait: 전송 패킷에 대해 확인 응답을 받은 후에만 다음 패킷 전송
    - Sliding Window: Window Size를 설정하여 해당 크기만큼 전송, ACK받으면 다음 전송
2. 혼잡제어: 네트워크 상에서 패킷이 넘치지 않도록 방지
    - AIMD \(Additive Increase / Multicative Decrease\)
        - 패킷을 하나씩 보내고 문제없이 도착하면 더 많은 패킷을 보내는 기법 \(실패하면 반대로\)
    - Slow Start: AIMD에 비해 2배씩 증가하여 전송, 혼잡 발생 시에는 1로 감소
    - Fast Retransmit: 중복된 순번의 패킷을 3개 받으면 재전송

### Subnetwork란?

### CIDR이란?


## OS

### OS란?
- 시스템의 자원\(하드웨어\)을 관리하고 동작을 제어하는 소프트웨어
- 응용 프로그램과 하드웨어 사이에서 인터페이스 역할
- 하는 일
    1. 프로세스 관리
    2. 저장장치 관리
    3. 네트워킹
    4. 사용자 관리
    5. 디바이스 드라이버

### Interrupt란?
- 프로그램 실행 도중 예기치 않은 상황이 발생 시 현재 작업을 중단하고 발생된 문제를 해결 후 복귀하는 것
- 종류
    1. 외부 인터럽트: 입출력 장치, 전원 등 외부 요인
    2. 내부 인터럽트: Trap이라고 하며, 잘못된 명령이나 데이터 사용 시 발생 \(0으로 나누기, 오버플로우 등\)
    3. 소프트웨어 인터럽트: 프로그램 처리 중 명령의 요청에 의해 발생 \(SVC 인터럽트\)
- 문제 해결 방식
    1. Polling: 계속해서 상태를 확인하여 변화를 알아내는 방식
    2. Interrupt: 변화\(이벤트 발생\) 시에만 일정한 동작을 하는 방식

### IPC란?
- Inter-Process Communication의 약자로 프로세스 간 통신을 의미
- 방식
    1. 익명 PIPE
    2. Named PIPE
    3. Message Queue
    4. Shared Memory
    5. Memory Map
    6. Socket

### CPU Scheduling이란?
- CPU를 효율적으로 사용하기 위해 프로세스의 실행 순서를 배정하는 것
    - 오버헤드를 낮추고, 사용률을 높이고, 기아 현상을 줄이기 위해 사용
- 종류
    - 선점형
        1. SRT \(Shortest Remaining Time\)
            - SJF의 선점형 버전
        2. Round Robin
            - 시분할 방식
            - time slice를 만들어 프로세스에게 할당 후 만료되면 다른 프로세스에게 할당
        3. Multi-level Queue
            - 우선순위 별로 큐를 만들어 높은 우선순위의 큐를 먼저 배정
            - 기아 현상 발생
        4. Multi-level Feedback Queue
            - 3번의 기아 현상 해결위해 사용
            - 높은 우선순위부터 낮은 우선순위 순으로 큐를 돌아가며 배정
    - 비선점형
        1. FIFO
        2. SJF \(Shortest Job First\)
        3. 우선순위

### Process Scheduling을 위한 Queue
1. Job Queue: 현재 시스템 내에 있는 모든 프로세스의 집합
2. Ready Queue: 현재 메모리 내에 있으면서 CPU 할당을 기다리는 프로세스의 집합
3. Device Queue: Device I/O작업을 대기하고 있는 프로세스의 집합

### Scheduler의 종류
1. 장기 스케줄러 \(Job Scheduler\)
    - 메모리와 디스크 사이의 스케줄링 담당
    - 프로세스에 메모리 및 자원 할당
    - 많은 프로세스들이 메모리에 올라올 경우 디스크에 임시로 저장시키는데, 이 중 어떤 프로세스를 메모리에 올려 Ready Queue로 보낼지 결정
2. 단기 스케줄러 \(CPU Scheduler\)
    - CPU와 메모리 사이의 스케줄링 담당
    - Ready Queue에 존재하는 프로세스 중 어떤 프로세스를 고를지 결정
    - 프로세스에 CPU를 할당 \(scheduler dispatch\)
3. 중기 스케줄러 \(Swapper\)
    - 프로세스에게서 메모리를 deallocate
    - 여유 공간 마련을 위해 프로세스를 통째로 메모리에서 쫒아냄 \(Swapping\)
    - 현 시스템에서 메모리에 너무 많은 프로그램이 동시에 올라가는 것을 조절

### 기아 현상 \(starvation\) 해결 방법
- Aging 기법: 오래 할당 받지 못하면 증가하는 카운터를 두어 이를 기준으로 할당에 적용

### Context Switching이란?
- 프로세스의 상태 정보를 PCB \(Process Control Block\)에 저장하고, 다음 순번의 프로세스를 복구하여 동작시키는 것
- Context: 프로세스의 상태 정보 \(레지스터 값, 메모리 상태 등\)

### Race Condition이란?
- 공유 자원에 대해 여러 프로세스가 동시에 접근할 때, 결과 값에 영향을 줄 수 있는 상태

### Deadlock이란?
- 프로세스가 자원 할당을 무한정 기다리고 있는 상태
- 발생 원인
    1. 상호 배제: 할당된 자원은 다른 프로세스가 사용할 수 없음
    2. 점유 및 대기: 자원을 할당받은 채 다른 자원 요구
    3. 비선점: 할당된 자원은 다른 프로세스에 의해 빼앗길 수 없음
    4. 환형 대기: 자원의 요구가 원형으로 이루어짐
- 해결방법
    1. 예방: 각 발생 원인을 예방
    2. 회피
        - 은행원 알고리즘
            - 프로세스가 실행 전 요구할 자원 제시
            - 자원 할당 전 안정/불안정 상태 체크 및 그에 따른 할당 결정
    3. 탐지
        - 시스템의 상태를 수시로 탐지하여 deadlock이 발생되는지 확인
    4. 회복
        - 프로세스를 하나씩 kill하며 deadlock 풀기

### Critical Section이란?
- Critical Section \(임계영역\)은 공유 자원을 동시에 접근하는 작업을 실행하는 코드 영역을 말함
- Critical Section Problem 해결 조건
    1. Mutual Exclusion \(상호 배제\)
        - 어떤 프로세스가 임계영역에서 실행 중이면 다른 프로세스는 접근 X
    2. Progress \(진행\)
        - 임계 영역에 들어간 프로세스가 없고 별도의 동작이 없는 프로세스들만 진입 후보로서 참여 가능
    3. Bounded Waiting \(한정된 대기\)
        - 어떤 프로세스가 진입 신청 후 받아들여질 때까지 다른 프로세스들이 진입하는 횟수는 제한되어야 함

### 동기화 기법에는 어떤 것이 있는가?
1. Semaphores \(세마포어\)
- 동기화 기법 중 하나로, 멀티프로그래밍 환경에서 공유 자원에 대한 접근을 제한
- 종류
    1. Binary Semaphore
        - MUTEX라고도 부르며, 0과 1의 값만을 가져 진입한 프로세스 외에는 접근이 불가
        - lock과 unlock을 통해 프로세스 접근 제한
    2. Counting Semaphore
        - 가용한 개수를 가진 자원에 대한 접근 제어용
        - 자원 사용시 감소, 방출 시 증가, 0이 되면 대기
        - MUTEX에 비해 여러 프로세스가 접근 가능
- 연산
    1. P연산: 임계구역에 들어가기 전 세마포어 감소
    2. V연산: 임계구역에서 나온 후 세마포어 증가, 자원 반납 및 대기 중인 프로세스를 깨움
- Busy Waiting
    - 초기에는 spin lock으로써 진입 코드를 계속 반복 실행하여 진입 여부 확인, CPU를 낭비함
    - 이는 프로세스를 Block시키고 이후 사용 가능 시 깨우는 방식으로 해결됨
2. 모니터
- 고급 언어의 설계 구조물로서, 개발자의 코드를 상호배제 하게끔 만든 추상화된 데이터 형태
- 자원 접근을 위한 키 획득과 자원 사용 후 해제를 모두 처리해줌

### Mutex와 Semaphore의 차이는?
1. 세마포어는 뮤텍스가 될 수 있지만, 뮤텍스는 세마포어가 될 수 없음
2. 세마포어는 소유가 불가능하지만, 뮤텍스는 소유 가능
3. 세마포어는 2개 이상의 접근 가능, 뮤텍스는 1개의 접근만 가능

### Swapping이란?
- 메모리 관리를 위해 사용되는 기법으로, 메모리 상의 프로세스를 보조 기억장치로 보내거나 불러들이는 기법
- 주로 메모리 공간이 부족할 때 시작됨
    - swap-in: 보조기억에서 주기억으로
    - swap-out: 주기억에서 보조기억으로

### 단편화\(Fragmentation\)란?
- 메모리 상의 사용하지 못할 만큼 작은 자유공간
    - 프로세스들이 메모리에 적재 및 제거를 반복하여 생김
- 종류
    1. 내부 단편화: 할당 공간이 실제 작업 공간에 비해 커서 낭비되는 부분
    2. 외부 단편화: 적재된 프로세스 사이의 남는 자유 공간
        - 압축을 통해 해결 가능, 하지만 효율이 좋지 않음

### 메모리 관리 기법의 종류는?
1. 연속 메모리 관리
    - 프로그램 전체가 하나의 커다란 공간에 연속적으로 할당
        - 고정 분할 기법: 고정된 파티션으로 분할 \(내부 단편화 발생\)
        - 동적 분할 기법: 프로그램의 크기와 같은 파티션으로 적재 \(외부 단편화 발생\)
2. 불연속 메모리 관리
    - 프로그램의 일부가 서로 다른 주소 공간에 할당
        - 페이지: 고정 사이즈로 분할한 프로세스의 조각
        - 프레임: 페이지와 같은 크기로 나눈 메모리의 조각
        - 세그먼트: 서로 다른 크기를 가진 논리적 블록이 연속적 공간에 배치되는 것

### Paging이란?
- 프로세스를 고정 크기로 분리\(페이지\)하고 메모리 공간도 이와 같은 크기로 분리\(프레임\)하여 할당
- 매핑 테이블\(MMU\)을 두어 물리 주소와 논리 주소 매핑
- 장점: 외부 단편화 해결
- 단점: 내부 단편화 발생

### Segmentation이란?
- 페이징처럼 고정 크기가 아닌 가변 크기의 논리적 단위인 세그먼트로 분리하는 것
- 사용자/프로그래머 관점의 메모리 관리 기법
- 장점: 내부 단편화 해결, 메모리 사용 효율 개선
- 단점: 외부 단편화 발생

### 가상 메모리란?
- 프로세스 전체가 메모리에 올라오지 않더라도 실행이 가능하도록 하는 기법
    - 실제 실행되는 프로세스의 부분만 메모리에 적재시킴
    - Paging 또는 Segmentation과 같이 사용하여 효율 개선
- 메모리 사용 효율 개선, 메모리 용량보다 큰 프로그램 실행 가능
- 실제 물리 메모리 개념과 사용자 관점의 논리 메모리 개념을 분리하여 작은 메모리를 가지고 큰 가상 주소 공간을 제공

### Demand Paging\(요구 페이징\)이란?
- 프로그램 적재 시 필요한 부분만 적재하는 전략
    - 가상 메모리 기법에서 많이 사용
- 실행 시 적재되지 않은 부분 요구 시 page fault 발생
    - 메모리 사용공간이 부족하다면 페이지 교체 발생

### 페이지 교체 알고리즘
- 적재할 페이지 대신 제거해야할 페이지\(victim\)를 찾는 알고리즘
- Belady의 모순: 페이지 프레임 개수를 늘려도 페이지 부재가 되려 더 많이 발생하는 모순이 존재
- 종류
    1. FIFO
    2. Optimal
        - 앞으로 가장 사용하지 않을 페이지 교체
        - 실질적인 구현이 어려움
    3. LRU \(Least Recently Used\)
        - 가장 오랫동안 사용되지 않은 페이지 교체
            - 가장 좋은 방법 중 하나
        - 시간의 관점
    4. LFU \(Least Frequently Used\)
        - 참조횟수가 가장 적은 페이지 교체
        - 사용 횟수의 관점
    5. MFU \(Most Frequently Used\)
        - 참조횟수가 가장 적은 페이지는 최근에 올라온 경우가 많고 앞으로 계속 쓰일 것이라는 가정에 기반

### Thrashing이란?
- Page Fault가 많아 프로그램 실행보다 페이지 교체에 CPU가 더 많은 시간을 쏟는 현상
- 해결방법
    1. Working-Set Model
        - 연관성이 높은 페이지들을 집합으로 만들어 이를 단위로 적재 및 교체
        - Working-Set: Locality가 포함되는 페이지들의 집합
        - 페이지 주변 등 관련된 곳에 자주 접근하려는 지역성을 이용한 방법
        - 오버헤드가 높기 때문에 잘 사용 안함
    2. Page Fault Frequency
        - Page Fault의 상한과 하한을 두어 상한 초과시 프레임 할당, 하한 미만 시 프레임 회수

### Cache Memory란?
- 속도가 빠른 장치와 느린 장치 간의 속도차에 따른 병목 현상을 줄이기 위한 메모리
    - Cache Hit 극대화 / Cache Miss 최소화
- 메모리에 쓰는 대신 캐시 메모리에 쓰고, 캐시 메모리에서 읽어들여 속도 향상
    - 실제 메모리와의 일관성 유지\(Coherence\)필요
    - 일관성 유지 방법
        1. Write Through: 캐시와 메모리 동시에 쓰기 실행
        2. Write Back: 캐시에만 쓰기 후 캐시가 교체될 때 메모리에 쓰기
- Locality\(지역성\)에 따른 적재
    - 타켓 데이터 및 이와 연관된 데이터를 같이 적재
    - 지역성 종류
        1. 시간적 지역성: 최근 참조된 주소가 계속 참조될 가능성이 높음
        2. 공간적 지역성: 최근 참조된 주소와 가까운 곳이 이후 참조될 가능성이 높음

### Cache Memory Mapping의 종류는?
1. Direct Mapping
    - 메모리를 캐시 용량에 따라 일정한 크기로 나누고 각각의 블록을 캐시에 매핑하는 방식
    - 구현이 쉬우나 비어있는 캐시 공간이 있더라도 정해진 공간에만 저장이 가능하여 성능 저하
2. Full Associative Mapping
    - 캐시 메모리 전체를 매핑 공간으로 사용, 비어있는 곳에 집어넣기
    - 캐시 히트율이 증가하나, 해당 데이터를 찾기 위해 캐시 전체를 검색해야함
3. Set Associative Mapping
    - 1과 2를 섞은 방식으로 캐시 메모리를 일정 크기로 나눈 후 그 블록의 비어있는 공간에 집어넣는 방식
    - 실제 사용하는 방식

### 사용자 수준 쓰레드와 커널 수준 쓰레드의 차이는?
- 사용자 수준 쓰레드
    - 장점: Context Switcing이 없어 오버헤드가 적음
    - 단점: 커널에서 인식하지 않기 떄문에 하나의 프로세스로 취급, 이것이 정지되면 쓰레드 모두 정지됨
- 커널 수준 쓰레드
    - 장점: 커널이 인식하기 때문에 멀티프로세서 활용 가능, CPU에 효율적 배당 가능
    - 단점: Context Switcing 발생

### 싱글쓰레드 장점은?
- 동기화 없고 컨텍스트 스위치 없어져 오버헤드 없어짐


### 크롤링 방지 방법은?
- 봇은 빠른 속도로 서핑하므로 액세스 속도를 기준으로 두어 차단 가능
- 주기적이고 많은 트래픽이 있는 IP는 봇이 의심되므로 차단
- 레이아웃을 약간씩 다르게 만들어 쉽게 크롤링할 수 없도록

### 3-way, 4-way 왜 종료시에는 4-way를 사용하는가

### JWT \(JSON Web Token\)란?
- CORS\(Cross Origin Resource Sharing\)
    - 보통 JS 엔진 표준에 프로토콜, 도메인, 포트가 다른 사이트의 자원 요청을 금지
        - 동일 출처 정책\(Same Origin Policy\)
        - 출처란 위의 3개를 의미
    - AJAX 등으로 인한 외부 자원 요청이 많아지자 이에 대한 대안으로 CORS가 추가됨
- 토큰 기반 인증 시스템
    - 원래는 서버 기반 인증 시스템 사용\(Stateful\)
        - 서버 기반 인증은 세션에 인증내역을 저장하기 때문에 유저 수 증가 시 서버 메모리 과부하
        - 쿠키에 저장을 하면 보안 이슈
    - 이러한 문제 해결을 위해 세션에 저장하지 않고, 토큰을 발행하여 유저에게 제공\(Stateless\)
        - 유저는 요청 시 토큰을 함께 서버에 전달하며, 서버는 토큰을 검증하고 확인하면 응답
        - 토큰에는 서버의 서명\(signature\)가 있어 변조 체크 가능
- 회원 인증 시에 사용하는 토큰 기반 인증 시스템의 표준

### 백만 트래픽의 처리 방법은?
- 로드 밸런싱
- Scale-out

### 브라우저에 사이트 url을 치면 일어나는 일을 7계층으로 설명하라

### 서버개발 시 OS 선택 및 이유는?
- 리눅스
    - GUI가 없기 때문에 그만큼 가볍고, 서버 성능에 영향을 줌
    - 무료인데다 오픈소스이기 때문에 비용이 발생하지 않음
    - 서버에 맞게 튜닝할 수 있어 유연함
    - UNIX와 호환성이 높음
    - 서버 관련 각종 툴들이 무료

### SSL이란?
- SSL\(Secure Socket Layer\) == TSL\(Transport Layer Security\)
    - 서버와 클라이언트 간 공유하는 암호화 키를 가지고 데이터를 암호화 및 송수신
        - HTTP는 평문 통신이기 때문에 도청 가능
        - TCP/IP또한 도청 가능한 네트워크
        - 이를 암호화하기 위한 프로토콜이 SSL을 더한 HTTPS
        - HTTP와 TCP 사이에 끼어져 통신
    - 서버는 SSL 인증서를 발급하여 클라이언트에게 줌
        - SSL 인증서는 CA\(Certificate Authority\)라는 보증된 3rd party에서 제공
            - 브라우저는 CA의 목록을 알고 있음
        - 인증서에는 서비스의 정보\(CA가 누군지, 서버 도메인 등\), 서버 측 공개키가 들어있음
    - SSL 통신에서는 공개키 방식을 이용해 대칭키를 암호화하여 서로 공유
        - 대칭키, 공개키 둘 다 사용하는 하이브리드 방식
        - 대칭키 암호화는 공개키를 통해, 실제 정보는 대칭키를 통해 암호화
        - 이 대칭키를 기반으로 통신
- SSL Handshake
    1. 클라이언트가 서버에 접속 \(Client Hello\)
        - 클라이언트 측 랜덤 데이터
        - 클라이언트의 암호화 방식들
        - 이미 handshake했다면 session ID를 통해 기존 세션 재사용
    2. 서버 응답 및 인증서 제공 \(Server Hello\)
        - 서버 측 랜덤 데이터
        - 서버가 사용하는 암호화 방식, 인증서 등 제공
    3. 클라이언트가 인증서 검증 및 대칭키 전송
        - 위 두개의 랜덤 데이터로 대칭키 생성
        - 서버의 공개키로 대칭키 암호화 및 전송
    4. 서버는 이를 받아 비공개키로 복호화, 대칭키 획득 및 세션 키 생성하여 전송
    5. 종료를 서로에게 알림

### HTTP Method PUT, POST, PATCH 차이점
- POST: SQL의 CREATE와 같은 기능, 여러번 같은 요청 시 서버 데이터 변경됨
- PUT: SQL의 UPDATE와 같은 기능, 여러번 같은 요청 시 UPDATE이기 때문에 한번만 데이터 변경됨
- PATCH: PUT과 같은 UPDATE이지만 PUT은 모든 필드를 변경, PATCH는 일부분만 변경됨

### ID password 저장법은?
- password는 해시함수를 돌려 암호화하여 저장
    - brute force 공격 방지를 위해 마지막에 랜덤 값 salt를 붙여 저장


## Database

### 반정규화
- 일부러 정규화를 하지 않는 것
- join이 많이 일어나는 것 == 성능 상 이슈
- 반정규화를 통해 한 테이블에 저장하여 성능 향상


## ETC

### Java GC 과정 설명
### Python GC 과정 설명
