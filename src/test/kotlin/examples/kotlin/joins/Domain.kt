/**
 *    Copyright 2016-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package examples.kotlin.joins

import java.util.*

data class OrderDetail(var orderId: Int? = null, var lineNumber: Int? = null, var description: String? = null, var quantity: Int? = null)

data class User(var userId: Int? = null, var userName: String? = null, var parentId: Int? = null)

data class OrderMaster(var id: Int? = null, var orderDate: Date? = null, var details: List<OrderDetail>? = null)
