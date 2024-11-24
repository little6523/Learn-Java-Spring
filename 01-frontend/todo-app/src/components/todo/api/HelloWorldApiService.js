import { apiClient } from './ApiClient'

// export default function retrieveHelloWolrdBean() {
//     return axios.get('http://localhost:8080/hello-world-bean')
// }

export const retrieveHelloWolrdBean
    = () => apiClient.get('/hello-world-bean')

export const retrieveHelloWolrdPathVariable
    = (username, token) => apiClient.get(`/hello-world/path-variable/${username}`
        // , {
        //     headers: {
        //         Authorization: token
        //     }
        // }
    )