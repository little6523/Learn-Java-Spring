import axios from 'axios'

// export default function retrieveHelloWolrdBean() {
//     return axios.get('http://localhost:8080/hello-world-bean')
// }

const apiClient = axios.create(
    {
        baseURL: 'http://localhost:8080'
    }
)

export const retrieveHelloWolrdBean
    = () => apiClient.get('/hello-world-bean')

export const retrieveHelloWolrdPathVariable
    = (username) => apiClient.get(`/hello-world/path-variable/${username}`)