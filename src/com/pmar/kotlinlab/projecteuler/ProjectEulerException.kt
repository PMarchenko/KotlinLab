package com.pmar.kotlinlab.projecteuler

import java.lang.RuntimeException

/**
 * @author Pavel Marchenko (Pavel.Marchenko@datart.com -- DataArt)
 */
class ProjectEulerException(message: String? = "Cannot solve the problem"): RuntimeException(message)