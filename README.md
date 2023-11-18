# LockLatencyTest

<br>

## 다양한 종류의 동시성 제어 방법들 간의 응답속도 차이
#### 프로젝트를 진행 중 락 관련하여 기술적 의사결정 과정을 위해 어떤 락이 가장 응답시간이 빠를지 테스트 해보기 위한 코드입니다.

- Synchronized
- Optimistic Lock
- Pessimistic Lock
- redis 기반 Lock
  - Lettuce
  - Redisson 라이브러리
