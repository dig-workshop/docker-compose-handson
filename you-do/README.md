# Docker Compose Hands on (You do)

![img.png](../compose.png)

Immersive WS Docker講義 Day3 Composeのハンズオン用Repoです

WSで学んだことを活かして、ソロでDocker周りの実装をしていくプロジェクトです

___

## プロジェクトの構成
- `/api` Spring Boot × kotlin のアプリケーション
- `/docker` Dockerfile が設置されているディレクトリ

## 要件

1. `docker-compose.yml`は、いくつかの欠陥を抱えています。
正しく修正したり不足している実装を書き足して、`api`コンテナと`db`コンテナを正常に起動できるようにしましょう。
修正が完了したら http://localhost:8080/api/hello?lastName=Ichinomiya にアクセスして
`Hello Ichiro!`が正しく返ってくることを目撃しましょう。

2. `docker-compose.yml`に`web`という新しいサービスを作成します。