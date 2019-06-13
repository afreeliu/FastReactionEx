
import {fetch} from "./fetch";
import url from "./url"

// 登录
export const fetchLogin = (username,password,captcha) => fetch({
  url: url.getLoginURL,/// 请求地址
  method: 'get', /// 请求方法
  params: {
    /// username,password,captcha //参数
  }
})

// 查看用户详情
export const fetchUserInfo = (userid) => fetch({
  url: url.getUserInfoURL,
  method: 'get',
  params: {
    userid
  }
})
