package com.example.tomokiiwai;

import com.example.tomokiiwai.rdb.allcommon.DBFluteBeansJavaConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * データベース設定
 *
 * @author tomoki.iwai
 */
@Configuration
@Import(DBFluteBeansJavaConfig.class)
public class D3DatabaseConfig {
}
