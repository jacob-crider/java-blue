import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '../views/Products'
import ProductDetail from '../views/ProductDetail'
import AddReview from '../views/AddReview'
import NotFound from '../views/NotFound'
import Store from '../store/index'

Vue.use(VueRouter)

/*
route = [
  {
    path: URL
    name: variableName for the route
    component: The component (view) to display
  }
]
*/
const routes = [
  {
    path: '/',
    name: 'products',
    component: Products
  },
  {
    path: '/products/:id',
    name: 'product-detail',
    component: ProductDetail
  },
  {
    path: '/products/:id/add-review',
    name: 'add-review',
    component: AddReview
  },
  {
    path: '/products',
    redirect: { name: 'products' }
  },
  {
    path: '*',
    name: 'notFound',
    component: NotFound
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

router.beforeEach( (to, from, next) => {
  // check if the route is one that has an id param
  if (to.name == 'product-detail' || to.name == 'add-review') {
    // get the id from the route params
    const id = to.params.id;
    // check if that id exists in the data (Vuex store)
    const product = Store.state.producst.find(
      product =>  {return product.id == id }
    );
    // if it does not exist, re-route to the 404 page
    if (!product) {
      next({ name: 'notFound' });
    }
    // if does exist, let user go where they were going
  }
  next();
})

export default router
