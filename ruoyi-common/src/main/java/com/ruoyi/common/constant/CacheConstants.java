package com.ruoyi.common.constant;

/**
 * @ClassName: CacheConstants
 * @ProjectName : ruo-yi-vue-blog
 * @Author : 16088
 * @Time : 2022/6/30 22:33
 * @Description : 添加描述信息
 */
public class CacheConstants
{
        /**
         * 登录用户 redis key
         */
        public static final String LOGIN_TOKEN_KEY = "login_tokens:";

        /**
         * 验证码 redis key
         */
        public static final String CAPTCHA_CODE_KEY = "captcha_codes:";

        /**
         * 参数管理 cache key
         */
        public static final String SYS_CONFIG_KEY = "sys_config:";

        /**
         * 字典管理 cache key
         */
        public static final String SYS_DICT_KEY = "sys_dict:";

        /**
         * 防重提交 redis key
         */
        public static final String REPEAT_SUBMIT_KEY = "repeat_submit:";

        /**
         * 限流 redis key
         */
        public static final String RATE_LIMIT_KEY = "rate_limit:";

        /**
         * 登录账户密码错误次数 redis key
         */
        public static final String PWD_ERR_CNT_KEY = "pwd_err_cnt:";
}
