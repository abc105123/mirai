/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

@file:Suppress("unused")

package net.mamoe.mirai.console.util

import net.mamoe.mirai.message.data.MessageChain
import net.mamoe.mirai.message.data.MessageContent

@ConsoleExperimentalApi
public object MessageUtils {
    @JvmStatic
    public fun MessageChain.messageContentsSequence(): Sequence<MessageContent> = asSequence().filterIsInstance<MessageContent>()

    @JvmStatic
    public fun MessageChain.firstContent(): MessageContent = messageContentsSequence().first()

    @JvmStatic
    public fun MessageChain.firstContentOrNull(): MessageContent? = messageContentsSequence().firstOrNull()
}