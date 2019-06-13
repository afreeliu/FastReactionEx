

import axios from 'axios'

export function fetch(options) {
  return new Promise((resolve, reject) => {
    const instance = axios.create({
      headers: {
        'Content-Type': 'application/json',
        //'token': global.token,/// token从全局变量中传入
      },
      timeout: 30 * 1000 /// 30秒超时
    });
    instance(options)
      .then(response => {/// then 请求成功之后进行什么操作
          resolve(response)
      })
      .catch(error=> {
        console.log('请求发生异常:' + error)
        reject(error)
      })
  })
}

