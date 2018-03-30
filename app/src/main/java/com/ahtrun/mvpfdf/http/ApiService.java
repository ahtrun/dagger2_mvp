package com.ahtrun.mvpfdf.http;

import com.ahtrun.mvpfdf.bean.Version;

import java.util.Map;

import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * <b>类名称：</b> UserService <br/>
 * <b>类描述：</b> <br/>
 * <b>创建人：</b> Lincoln <br/>
 * <b>修改人：</b> Lincoln <br/>
 * <b>修改时间：</b> 2016年08月12日 下午4:00<br/>
 * <b>修改备注：</b> <br/>
 *
 * @version 1.0.0 <br/>
 */
public interface ApiService {
    String BASE_URL = "https://bbc.weinihaigou.com";

    @POST("/version/getVersionSix.shtml")
    Observable<HttpRespBean<Version>> getVersion(@QueryMap Map<String,Object> params);

}
