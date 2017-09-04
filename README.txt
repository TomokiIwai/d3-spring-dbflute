This software is released under the MIT License, see LICENSE file

[必要な前提条件]
* MySQLサーバーを起動するために、docker、docker-composeがインストール済みであること

[MySQLサーバー起動手順]
* cd docker
* docker-compose build
* docker-compose up -d

[この環境の作り方]
* settings.gradleへモジュールディレクトリを記載
* build.gradleへ「project(':xxx')」を定義
* build.gradleの「subprojects」へプロジェクト共通の設定を定義

* dbflute-1.1.4.zipをrdb/mydbflute/dbflute-1.1.4として解凍
* rdb/mydbflute/dbflute-1.1.4/etc/client-template/dbflute_dfclient.zipをrdb/dbflute_dfclientとして解凍

* dbflute_dfclient/dfprop
 * basicInfoMap.dfpropへどんなDBMSかなどを定義
 * databaseInfoMap.dfpropへどうやって接続するかを定義
* dbflute_dfclient/playsql
 * replace-schema.sqlへDDL
* rdb/dbflute_dfclientで「sh manage.sh」からrenewalを選択してDAO/DTOを生成

* application.propertiesへアプリケーションの接続情報
* @Configurationなクラスで@Import(DBFluteBeansJavaConfig.class)