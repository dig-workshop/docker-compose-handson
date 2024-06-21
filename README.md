# Docker Compose Hands on

![img.png](compose.png)

Immersive WS Docker講義 Day3 Composeのハンズオン用Repoです

___

## プロジェクトの構成
- `/api` Spring Boot × kotlin のアプリケーション
- `/docker` Dockerfile, docker-compose.yml が設置されているディレクトリ

___

## コンテナの構成
- `api` Spring Bootのアプリケーションを動かすコンテナ
- `db` PostgreSQLを動かすコンテナ

___
## Dockerコンテナの起動方法

### ● Dockerfile + コマンドで起動するパターン

1. イメージをビルドする
```bash
cd docker
docker image build -t api-img --no-cache -f ./Dockerfile  ../
```
2. `api-img`イメージが作成されたことを確認する
```bash
docker image ls
```

3. コンテナを起動する
```bash
docker container run -p 8080:8080 --name api --rm api-img
```

4. http://localhost:8080/api/hello?lastName=Ichinomiya にアクセス
5. `Hello Ichiro`の文字列がレスポンスされることを確認する

___

### ● Docker Composeで起動するパターン

1. Composeを起動する
```bash
cd docker
docker compose up
```
2. http://localhost:8080/api/hello?lastName=Ichinomiya にアクセス
3. `Hello Ichiro`の文字列がレスポンスされることを確認する
