"""
    Zulip REST API

    Powerful open source group chat   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import openapi_client
from openapi_client.model.basic_bot_base import BasicBotBase
from openapi_client.model.bot_all_of import BotAllOf
globals()['BasicBotBase'] = BasicBotBase
globals()['BotAllOf'] = BotAllOf
from openapi_client.model.bot import Bot


class TestBot(unittest.TestCase):
    """Bot unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testBot(self):
        """Test Bot"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Bot()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
