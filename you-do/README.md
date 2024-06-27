# Docker Compose Hands on (You do)

![img.png](../compose.png)

Immersive WS Docker講義 Day3 Composeのハンズオン用Repoです

WSで学んだことを活かして、ソロでDocker周りの実装をしていくプロジェクトです

___

## プロジェクトの構成
- `/api` Spring Boot × kotlin のアプリケーション
- `/docker` Dockerfile が設置されているディレクトリ

## 要件

`docker-compose.yml`は、いくつかの欠陥を抱えています。
正しく修正したり不足している実装を書き足して、`api`コンテナと`db`コンテナを正常に起動できるようにしましょう。
修正が完了したら http://localhost:8080/api/hello?lastName=Ichinomiya にアクセスして
`Hello Ichiro!`が正しく返ってくることを目撃しましょう。

## ルール

- we-doと比べて、docker-compose.ymlの階層が変わっていることに注意してください。
- 実装するのは`docker-compose.yml`のみです。他のファイルは変更しないでください。
- ディレクトリ構造を変えてはいけません。
- `db`サービスのヘルスチェックを実施し、healthyであることを確認してから`api`コンテナが起動するようにして下さい。 
- healthcheckのコマンドは`psql -U postgres`に設定してください。