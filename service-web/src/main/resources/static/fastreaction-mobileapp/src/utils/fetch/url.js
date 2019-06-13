


let service = 'dev'
// let service = 'prod'
let api = ''
if (service === 'dev'){
  // dev 开发环境
  api = ''
} else if (service === 'prod'){
  // prod 部署环境
  api = ''
}


export default {
  // 登录接口
  getLoginURL: '${api}/xx/xx/xx',
  // 获取用户信息接口
  getUserInfoURL: '${api}/xx/xx/xx'
}
