/**
 * Copyright (c) 2012 Partners In Health.  All rights reserved.
 * The use and distribution terms for this software are covered by the
 * Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 * which can be found in the file epl-v10.html at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by
 * the terms of this license.
 * You must not remove this notice, or any other, from this software.
 **/
package org.pih.warehouse.core

class PartyType {

    String id
    String code
    String name
    String description

    PartyTypeCode partyTypeCode

    Date dateCreated
    Date lastUpdated


    static mapping = {
        id generator: 'uuid'
    }

    static constraints = {
        code(nullable: false, unique: true)
        name(nullable: false, maxSize: 255)
        description(nullable: true, maxSize: 255)
        dateCreated(display: false)
        lastUpdated(display: false)
        partyTypeCode(nullable: false)
    }

    String toString() {
        return name
    }
}
