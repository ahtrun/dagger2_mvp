package com.ahtrun.mvpfdf.bean;

import java.io.Serializable;

/**
 * Created by 1 on 2018/3/30.
 */

public class Version implements Serializable{


        /**
         * subject : null
         * sys : {"id":1,"verType":2,"verNo":"1.4.1","remark":"更新说明\r\n【重磅】\r\n1.预售功能强势上线，提前预采你的货\r\n2.搜索引擎全面优化，准确提升匹配度\r\n\r\n【优化】\r\n登录流程优化，用户名便可登录\r\n商品详情优化，巨细无遗更全面","updateTime":1500000600000,"downloadUrl":"http://a.app.qq.com/o/simple.jsp?pkgname=com.nyso.supply","updateFlag":false,"verValue":1401,"enforceVerNo":1202}
         */

        private Object subject;
        private SysBean sys;
        public Object getSubject() {
            return subject;
        }
        public void setSubject(Object subject) {
            this.subject = subject;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public static class SysBean {
            /**
             * id : 1
             * verType : 2
             * verNo : 1.4.1
             * remark : 更新说明
             【重磅】
             1.预售功能强势上线，提前预采你的货
             2.搜索引擎全面优化，准确提升匹配度

             【优化】
             登录流程优化，用户名便可登录
             商品详情优化，巨细无遗更全面
             * updateTime : 1500000600000
             * downloadUrl : http://a.app.qq.com/o/simple.jsp?pkgname=com.nyso.supply
             * updateFlag : false
             * verValue : 1401
             * enforceVerNo : 1202
             */

            private int id;
            private int verType;
            private String verNo;
            private String remark;
            private long updateTime;
            private String downloadUrl;
            private boolean updateFlag;
            private int verValue;
            private int enforceVerNo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getVerType() {
                return verType;
            }

            public void setVerType(int verType) {
                this.verType = verType;
            }

            public String getVerNo() {
                return verNo;
            }

            public void setVerNo(String verNo) {
                this.verNo = verNo;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public String getDownloadUrl() {
                return downloadUrl;
            }

            public void setDownloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
            }

            public boolean isUpdateFlag() {
                return updateFlag;
            }

            public void setUpdateFlag(boolean updateFlag) {
                this.updateFlag = updateFlag;
            }

            public int getVerValue() {
                return verValue;
            }

            public void setVerValue(int verValue) {
                this.verValue = verValue;
            }

            public int getEnforceVerNo() {
                return enforceVerNo;
            }

            public void setEnforceVerNo(int enforceVerNo) {
                this.enforceVerNo = enforceVerNo;
            }
        }
    }

